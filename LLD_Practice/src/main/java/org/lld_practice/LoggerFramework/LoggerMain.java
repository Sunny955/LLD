package org.lld_practice.LoggerFramework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggerMain {
    private LogLevel logLevel;
    private LogDestination logDestination;

    public LoggerMain(LogLevel logLevel, LogDestination logDestination) {
        this.logLevel = logLevel;
        this.logDestination = logDestination;
    }

    public void log(LogLevel level, String message) {
        System.out.println("LEVEL ORDINAL - " + level.ordinal());
        System.out.println("THIS LOG LEVEL ORDINAL - " + this.logLevel.ordinal());
        if (level.ordinal() >= this.logLevel.ordinal()) {
            String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            String formattedMessage = timeStamp + " [" + level.name() + "] " + message;
            logDestination.writeLog(formattedMessage);
        }
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public LogDestination getLogDestination() {
        return logDestination;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setLogDestination(LogDestination logDestination) {
        this.logDestination = logDestination;
    }
}
