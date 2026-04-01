/*
 * Copyright (c) 2021 Taner Sener
 *
 * This file is part of FFmpegKit.
 *
 * FFmpegKit is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FFmpegKit is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with FFmpegKit.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.arthenica.ffmpegkit.reactnative;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FFmpegKitReactNativePackage extends BaseReactPackage {

  private static final String MODULE_NAME = "FFmpegKitReactNativeModule";
  private static final String TURBO_MODULE_CLASS_NAME =
      "com.arthenica.ffmpegkit.reactnative.FFmpegKitReactNativeTurboModule";

  @Nullable
  @Override
  public NativeModule getModule(@NonNull String name, @NonNull ReactApplicationContext reactContext) {
    if (!MODULE_NAME.equals(name)) {
      return null;
    }

    if (BuildConfig.IS_NEW_ARCHITECTURE_ENABLED) {
      return createTurboModule(reactContext);
    }

    return new FFmpegKitReactNativeModule(reactContext);
  }

  @NonNull
  @Override
  public ReactModuleInfoProvider getReactModuleInfoProvider() {
    return () -> {
      final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();
      moduleInfos.put(
          MODULE_NAME,
          new ReactModuleInfo(
              MODULE_NAME,
              MODULE_NAME,
              false,
              false,
              false,
              BuildConfig.IS_NEW_ARCHITECTURE_ENABLED));
      return moduleInfos;
    };
  }

  @NonNull
  @Override
  public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }

  @NonNull
  private NativeModule createTurboModule(@NonNull ReactApplicationContext reactContext) {
    try {
      final Class<?> turboModuleClass = Class.forName(TURBO_MODULE_CLASS_NAME);
      final Constructor<?> constructor = turboModuleClass.getConstructor(ReactApplicationContext.class);
      final Object module = constructor.newInstance(reactContext);
      if (module instanceof NativeModule) {
        return (NativeModule) module;
      }
      throw new IllegalStateException("Turbo module is not a NativeModule instance");
    } catch (final Exception exception) {
      throw new RuntimeException("Failed to create FFmpegKitReactNative turbo module", exception);
    }
  }
}
