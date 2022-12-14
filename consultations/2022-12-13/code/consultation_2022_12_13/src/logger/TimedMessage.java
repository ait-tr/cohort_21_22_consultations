package logger;

public class TimedMessage extends Message {
    String time; // "YYYY.MM.DD.HH.MM.SS"

    public TimedMessage(String level, String message, String time) {
        super(level, message);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return level + ":" + time + ":" + message;
    }
}
