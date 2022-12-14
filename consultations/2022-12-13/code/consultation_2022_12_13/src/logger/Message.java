package logger;

public class Message {
    protected String level;
    // DEBG = DEBUG
    // INFO
    // WARN = WARNING
    // ERRR = ERROR
    // CRIT = CRITICAL

    protected String message;

    public Message(String level, String message) {
        this.level = level;
        this.message = message;
    }

    public String getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return level + ":" + message;
    }
}
