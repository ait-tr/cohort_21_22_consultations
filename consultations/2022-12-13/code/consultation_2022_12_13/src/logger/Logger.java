package logger;

public class Logger {
    private Message[] messages;
    private int newIndex;
    private int capacity;

    public Logger() {
        capacity = 10;
        newIndex = 0;
        messages = new Message[capacity];
    }

    public void addMessage(Message message) {
        if (newIndex == capacity) {
            capacity *= 2;
            Message[] newMessages = new Message[capacity];
            for (int i = 0; i < newIndex; i++) {
                newMessages[i] = messages[i];
            }
            messages = newMessages;
        }
        messages[newIndex] = message;
        newIndex++;
    }

    public Message[] getMessages() {
        Message[] result = new Message[newIndex];
        for (int i = 0; i < newIndex; i++) {
            result[i] = messages[i];
        }
        return result;
    }

    public Message[] getMessages(String level) {
        int counter = 0;
        for (Message message : messages) {
            if (message != null && message.getLevel().equals(level)) {
                counter++;
            }
        }

        Message[] result = new Message[counter];
        int i = 0;
        for (Message message : messages) {
            if (message != null && message.getLevel().equals(level)) {
                result[i] = message;
                i++;
            }
        }
        return result;
    }
}
