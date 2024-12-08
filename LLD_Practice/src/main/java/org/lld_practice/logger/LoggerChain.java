package org.lld_practice.logger;

public class LoggerChain {
    public static Logger getLoggerChain() {
        Logger errorLogger = new Error(LogLevel.ERROR);
        Logger debugLogger = new Debug(LogLevel.DEBUG);
        Logger infoLogger = new Info(LogLevel.INFO);

        infoLogger.setNext(debugLogger);
        debugLogger.setNext(errorLogger);

        return infoLogger;
    }
}
