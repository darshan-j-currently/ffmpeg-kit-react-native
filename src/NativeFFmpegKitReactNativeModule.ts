import type {TurboModule} from 'react-native';
import {TurboModuleRegistry} from 'react-native';
import type {UnsafeObject} from 'react-native/Libraries/Types/CodegenTypes';

export interface Spec extends TurboModule {
  addListener(eventName: string): void;
  removeListeners(count: number): void;

  abstractSessionGetEndTime(sessionId: number): Promise<number>;
  abstractSessionGetDuration(sessionId: number): Promise<number>;
  abstractSessionGetAllLogs(sessionId: number, waitTimeout: number): Promise<ReadonlyArray<UnsafeObject>>;
  abstractSessionGetLogs(sessionId: number): Promise<ReadonlyArray<UnsafeObject>>;
  abstractSessionGetAllLogsAsString(sessionId: number, waitTimeout: number): Promise<string>;
  abstractSessionGetState(sessionId: number): Promise<number>;
  abstractSessionGetReturnCode(sessionId: number): Promise<number>;
  abstractSessionGetFailStackTrace(sessionId: number): Promise<string>;
  thereAreAsynchronousMessagesInTransmit(sessionId: number): Promise<boolean>;
  abstractSessionThereAreAsynchronousMessagesInTransmit(sessionId: number): Promise<boolean>;

  getArch(): Promise<string>;

  ffmpegSession(argumentsArray: ReadonlyArray<string>): Promise<UnsafeObject>;
  ffmpegSessionGetAllStatistics(sessionId: number, waitTimeout: number): Promise<ReadonlyArray<UnsafeObject>>;
  ffmpegSessionGetStatistics(sessionId: number): Promise<ReadonlyArray<UnsafeObject>>;

  ffprobeSession(argumentsArray: ReadonlyArray<string>): Promise<UnsafeObject>;

  mediaInformationSession(argumentsArray: ReadonlyArray<string>): Promise<UnsafeObject>;

  mediaInformationJsonParserFrom(ffprobeJsonOutput: string): Promise<UnsafeObject>;
  mediaInformationJsonParserFromWithError(ffprobeJsonOutput: string): Promise<UnsafeObject>;

  enableRedirection(): Promise<void>;
  disableRedirection(): Promise<void>;
  enableLogs(): Promise<void>;
  disableLogs(): Promise<void>;
  enableStatistics(): Promise<void>;
  disableStatistics(): Promise<void>;

  setFontconfigConfigurationPath(path: string): Promise<void>;
  setFontDirectory(fontDirectoryPath: string, fontNameMap: UnsafeObject | null): Promise<void>;
  setFontDirectoryList(fontDirectoryList: ReadonlyArray<string>, fontNameMap: UnsafeObject | null): Promise<void>;

  registerNewFFmpegPipe(): Promise<string>;
  closeFFmpegPipe(ffmpegPipePath: string): Promise<void>;
  getFFmpegVersion(): Promise<string>;
  isLTSBuild(): Promise<boolean>;
  getBuildDate(): Promise<string>;
  setEnvironmentVariable(variableName: string, variableValue: string): Promise<void>;

  ignoreSignal(signalValue: number): Promise<void>;

  ffmpegSessionExecute(sessionId: number): Promise<void>;
  ffprobeSessionExecute(sessionId: number): Promise<void>;
  mediaInformationSessionExecute(sessionId: number, waitTimeout: number): Promise<void>;

  asyncFFmpegSessionExecute(sessionId: number): Promise<void>;
  asyncFFprobeSessionExecute(sessionId: number): Promise<void>;
  asyncMediaInformationSessionExecute(sessionId: number, waitTimeout: number): Promise<void>;

  getLogLevel(): Promise<number>;
  setLogLevel(level: number): Promise<void>;

  getSessionHistorySize(): Promise<number>;
  setSessionHistorySize(sessionHistorySize: number): Promise<void>;

  getSession(sessionId: number): Promise<UnsafeObject>;
  getLastSession(): Promise<UnsafeObject>;
  getLastCompletedSession(): Promise<UnsafeObject>;
  getSessions(): Promise<ReadonlyArray<UnsafeObject>>;
  clearSessions(): Promise<void>;
  getSessionsByState(sessionState: number): Promise<ReadonlyArray<UnsafeObject>>;

  getLogRedirectionStrategy(): Promise<number>;
  setLogRedirectionStrategy(logRedirectionStrategy: number): Promise<void>;

  messagesInTransmit(sessionId: number): Promise<number>;
  getPlatform(): Promise<string>;

  writeToPipe(inputPath: string, namedPipePath: string): Promise<number>;
  selectDocument(
    writable: boolean,
    title: string | null,
    type: string | null,
    extraTypes: ReadonlyArray<string> | null
  ): Promise<string>;
  getSafParameter(uriString: string, openMode: string): Promise<string>;

  cancel(): Promise<void>;
  cancelSession(sessionId: number): Promise<void>;

  getFFmpegSessions(): Promise<ReadonlyArray<UnsafeObject>>;
  getFFprobeSessions(): Promise<ReadonlyArray<UnsafeObject>>;
  getMediaInformationSessions(): Promise<ReadonlyArray<UnsafeObject>>;
  getMediaInformation(sessionId: number): Promise<UnsafeObject>;

  getPackageName(): Promise<string>;
  getExternalLibraries(): Promise<ReadonlyArray<string>>;

  uninit(): Promise<void>;
}

export default TurboModuleRegistry.get<Spec>('FFmpegKitReactNativeModule');
