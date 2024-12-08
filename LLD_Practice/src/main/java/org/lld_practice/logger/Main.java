package org.lld_practice.logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerChain.getLoggerChain();

        logger.logMessage(LogLevel.INFO, "This is info");
        logger.logMessage(LogLevel.DEBUG, "This is debug");
        logger.logMessage(LogLevel.ERROR, "This is error");
    }
}
