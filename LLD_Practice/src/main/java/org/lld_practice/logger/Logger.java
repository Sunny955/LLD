package org.lld_practice.logger;

public abstract class Logger {
    protected LogLevel logLevel;
    protected Logger next;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setNext(Logger next) {
        this.next = next;
    }

    public void logMessage(LogLevel level, String message) {
        if (this.logLevel.ordinal() == level.ordinal()) {
            write(message);
        }
        if (next != null) {
            next.logMessage(level, message);
        }
    }

    protected abstract void write(String message);

}
