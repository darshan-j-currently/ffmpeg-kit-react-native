/*
 * Copyright (c) 2026
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

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/**
 * TurboModule wrapper that reuses the legacy module implementation.
 */
public class FFmpegKitReactNativeTurboModule extends NativeFFmpegKitReactNativeModuleSpec {

  public static final String NAME = "FFmpegKitReactNativeModule";

  private final FFmpegKitReactNativeModule delegate;

  public FFmpegKitReactNativeTurboModule(final ReactApplicationContext reactContext) {
    super(reactContext);
    delegate = new FFmpegKitReactNativeModule(reactContext);
  }

  @NonNull
  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public void addListener(String eventName) {
    delegate.addListener(eventName);
  }

  @Override
  public void removeListeners(double count) {
    delegate.removeListeners(count);
  }

  @Override
  public void abstractSessionGetEndTime(double sessionId, Promise promise) {
    delegate.abstractSessionGetEndTime(sessionId, promise);
  }

  @Override
  public void abstractSessionGetDuration(double sessionId, Promise promise) {
    delegate.abstractSessionGetDuration(sessionId, promise);
  }

  @Override
  public void abstractSessionGetAllLogs(double sessionId, double waitTimeout, Promise promise) {
    delegate.abstractSessionGetAllLogs(sessionId, waitTimeout, promise);
  }

  @Override
  public void abstractSessionGetLogs(double sessionId, Promise promise) {
    delegate.abstractSessionGetLogs(sessionId, promise);
  }

  @Override
  public void abstractSessionGetAllLogsAsString(double sessionId, double waitTimeout, Promise promise) {
    delegate.abstractSessionGetAllLogsAsString(sessionId, waitTimeout, promise);
  }

  @Override
  public void abstractSessionGetState(double sessionId, Promise promise) {
    delegate.abstractSessionGetState(sessionId, promise);
  }

  @Override
  public void abstractSessionGetReturnCode(double sessionId, Promise promise) {
    delegate.abstractSessionGetReturnCode(sessionId, promise);
  }

  @Override
  public void abstractSessionGetFailStackTrace(double sessionId, Promise promise) {
    delegate.abstractSessionGetFailStackTrace(sessionId, promise);
  }

  @Override
  public void thereAreAsynchronousMessagesInTransmit(double sessionId, Promise promise) {
    delegate.thereAreAsynchronousMessagesInTransmit(sessionId, promise);
  }

  @Override
  public void abstractSessionThereAreAsynchronousMessagesInTransmit(double sessionId, Promise promise) {
    delegate.abstractSessionThereAreAsynchronousMessagesInTransmit(sessionId, promise);
  }

  @Override
  public void getArch(Promise promise) {
    delegate.getArch(promise);
  }

  @Override
  public void ffmpegSession(ReadableArray readableArray, Promise promise) {
    delegate.ffmpegSession(readableArray, promise);
  }

  @Override
  public void ffmpegSessionGetAllStatistics(double sessionId, double waitTimeout, Promise promise) {
    delegate.ffmpegSessionGetAllStatistics(sessionId, waitTimeout, promise);
  }

  @Override
  public void ffmpegSessionGetStatistics(double sessionId, Promise promise) {
    delegate.ffmpegSessionGetStatistics(sessionId, promise);
  }

  @Override
  public void ffprobeSession(ReadableArray readableArray, Promise promise) {
    delegate.ffprobeSession(readableArray, promise);
  }

  @Override
  public void mediaInformationSession(ReadableArray readableArray, Promise promise) {
    delegate.mediaInformationSession(readableArray, promise);
  }

  @Override
  public void mediaInformationJsonParserFrom(String ffprobeJsonOutput, Promise promise) {
    delegate.mediaInformationJsonParserFrom(ffprobeJsonOutput, promise);
  }

  @Override
  public void mediaInformationJsonParserFromWithError(String ffprobeJsonOutput, Promise promise) {
    delegate.mediaInformationJsonParserFromWithError(ffprobeJsonOutput, promise);
  }

  @Override
  public void enableRedirection(Promise promise) {
    delegate.enableRedirection(promise);
  }

  @Override
  public void disableRedirection(Promise promise) {
    delegate.disableRedirection(promise);
  }

  @Override
  public void enableLogs(Promise promise) {
    delegate.enableLogs(promise);
  }

  @Override
  public void disableLogs(Promise promise) {
    delegate.disableLogs(promise);
  }

  @Override
  public void enableStatistics(Promise promise) {
    delegate.enableStatistics(promise);
  }

  @Override
  public void disableStatistics(Promise promise) {
    delegate.disableStatistics(promise);
  }

  @Override
  public void setFontconfigConfigurationPath(String path, Promise promise) {
    delegate.setFontconfigConfigurationPath(path, promise);
  }

  @Override
  public void setFontDirectory(String fontDirectoryPath, ReadableMap fontNameMap, Promise promise) {
    delegate.setFontDirectory(fontDirectoryPath, fontNameMap, promise);
  }

  @Override
  public void setFontDirectoryList(ReadableArray readableArray, ReadableMap fontNameMap, Promise promise) {
    delegate.setFontDirectoryList(readableArray, fontNameMap, promise);
  }

  @Override
  public void registerNewFFmpegPipe(Promise promise) {
    delegate.registerNewFFmpegPipe(promise);
  }

  @Override
  public void closeFFmpegPipe(String ffmpegPipePath, Promise promise) {
    delegate.closeFFmpegPipe(ffmpegPipePath, promise);
  }

  @Override
  public void getFFmpegVersion(Promise promise) {
    delegate.getFFmpegVersion(promise);
  }

  @Override
  public void isLTSBuild(Promise promise) {
    delegate.isLTSBuild(promise);
  }

  @Override
  public void getBuildDate(Promise promise) {
    delegate.getBuildDate(promise);
  }

  @Override
  public void setEnvironmentVariable(String variableName, String variableValue, Promise promise) {
    delegate.setEnvironmentVariable(variableName, variableValue, promise);
  }

  @Override
  public void ignoreSignal(double signalValue, Promise promise) {
    delegate.ignoreSignal(signalValue, promise);
  }

  @Override
  public void ffmpegSessionExecute(double sessionId, Promise promise) {
    delegate.ffmpegSessionExecute(sessionId, promise);
  }

  @Override
  public void ffprobeSessionExecute(double sessionId, Promise promise) {
    delegate.ffprobeSessionExecute(sessionId, promise);
  }

  @Override
  public void mediaInformationSessionExecute(double sessionId, double waitTimeout, Promise promise) {
    delegate.mediaInformationSessionExecute(sessionId, waitTimeout, promise);
  }

  @Override
  public void asyncFFmpegSessionExecute(double sessionId, Promise promise) {
    delegate.asyncFFmpegSessionExecute(sessionId, promise);
  }

  @Override
  public void asyncFFprobeSessionExecute(double sessionId, Promise promise) {
    delegate.asyncFFprobeSessionExecute(sessionId, promise);
  }

  @Override
  public void asyncMediaInformationSessionExecute(double sessionId, double waitTimeout, Promise promise) {
    delegate.asyncMediaInformationSessionExecute(sessionId, waitTimeout, promise);
  }

  @Override
  public void getLogLevel(Promise promise) {
    delegate.getLogLevel(promise);
  }

  @Override
  public void setLogLevel(double level, Promise promise) {
    delegate.setLogLevel(level, promise);
  }

  @Override
  public void getSessionHistorySize(Promise promise) {
    delegate.getSessionHistorySize(promise);
  }

  @Override
  public void setSessionHistorySize(double sessionHistorySize, Promise promise) {
    delegate.setSessionHistorySize(sessionHistorySize, promise);
  }

  @Override
  public void getSession(double sessionId, Promise promise) {
    delegate.getSession(sessionId, promise);
  }

  @Override
  public void getLastSession(Promise promise) {
    delegate.getLastSession(promise);
  }

  @Override
  public void getLastCompletedSession(Promise promise) {
    delegate.getLastCompletedSession(promise);
  }

  @Override
  public void getSessions(Promise promise) {
    delegate.getSessions(promise);
  }

  @Override
  public void clearSessions(Promise promise) {
    delegate.clearSessions(promise);
  }

  @Override
  public void getSessionsByState(double sessionState, Promise promise) {
    delegate.getSessionsByState(sessionState, promise);
  }

  @Override
  public void getLogRedirectionStrategy(Promise promise) {
    delegate.getLogRedirectionStrategy(promise);
  }

  @Override
  public void setLogRedirectionStrategy(double logRedirectionStrategy, Promise promise) {
    delegate.setLogRedirectionStrategy(logRedirectionStrategy, promise);
  }

  @Override
  public void messagesInTransmit(double sessionId, Promise promise) {
    delegate.messagesInTransmit(sessionId, promise);
  }

  @Override
  public void getPlatform(Promise promise) {
    delegate.getPlatform(promise);
  }

  @Override
  public void writeToPipe(String inputPath, String namedPipePath, Promise promise) {
    delegate.writeToPipe(inputPath, namedPipePath, promise);
  }

  @Override
  public void selectDocument(boolean writable, String title, String type, ReadableArray extraTypes, Promise promise) {
    delegate.selectDocument(writable, title, type, extraTypes, promise);
  }

  @Override
  public void getSafParameter(String uriString, String openMode, Promise promise) {
    delegate.getSafParameter(uriString, openMode, promise);
  }

  @Override
  public void cancel(Promise promise) {
    delegate.cancel(promise);
  }

  @Override
  public void cancelSession(double sessionId, Promise promise) {
    delegate.cancelSession(sessionId, promise);
  }

  @Override
  public void getFFmpegSessions(Promise promise) {
    delegate.getFFmpegSessions(promise);
  }

  @Override
  public void getFFprobeSessions(Promise promise) {
    delegate.getFFprobeSessions(promise);
  }

  @Override
  public void getMediaInformationSessions(Promise promise) {
    delegate.getMediaInformationSessions(promise);
  }

  @Override
  public void getMediaInformation(double sessionId, Promise promise) {
    delegate.getMediaInformation(sessionId, promise);
  }

  @Override
  public void getPackageName(Promise promise) {
    delegate.getPackageName(promise);
  }

  @Override
  public void getExternalLibraries(Promise promise) {
    delegate.getExternalLibraries(promise);
  }

  @Override
  public void uninit(Promise promise) {
    delegate.uninit(promise);
  }

}
