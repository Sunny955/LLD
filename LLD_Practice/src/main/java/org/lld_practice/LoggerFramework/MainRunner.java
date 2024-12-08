package org.lld_practice.LoggerFramework;

public class MainRunner {
    public static void main(String[] args) {
        LogDestination consoleDestination = new ConsoleDestination();
        LoggerMain logger = new LoggerMain(LogLevel.DEBUG,consoleDestination);

        logger.log(LogLevel.DEBUG,"Debug message in console");
        logger.log(LogLevel.ERROR,"Error message in console");

        String fileName = "logs.txt";
        LogDestination fileDestination = new FileDestination(fileName);
        LoggerMain fileLogger = new LoggerMain(LogLevel.INFO,fileDestination);

        fileLogger.log(LogLevel.INFO,"Info message to a file");
        fileLogger.log(LogLevel.WARN,"Warn message to a file");

        System.out.println("Logging in console and file completed!");
    }
}
