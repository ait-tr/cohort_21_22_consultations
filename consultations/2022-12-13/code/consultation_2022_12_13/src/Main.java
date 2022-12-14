import logger.Logger;
import logger.Message;
import logger.TimedMessage;

public class Main {
    // вопросы:
    // - классы
    // - массив внутри класса
    // - наследование -- типы переменных и содержимое -- зачем
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.addMessage(new Message("INFO", "Program started"));
        // Message timedMessage = new TimedMessage("WARN", "logger.TimedMessage", "2022.12.13.16.22.40"); -- можно
        // TimedMessage timedMessage = new TimedMessage("WARN", "logger.TimedMessage", "2022.12.13.16.22.40"); -- тоже можно
        // Message timedMessage = fabric.makeMessage("message"); -- тоже можно
        // TimedMessage timedMessage = fabric.makeMessage("message"); -- не стоит, если мы не уверены,
        // что makeMessage вернёт именно TimedMessage
        TimedMessage timedMessage = new TimedMessage("WARN", "logger.TimedMessage", "2022.12.13.16.22.40");
        System.out.println(timedMessage.getTime()); // чтобы вызвать getTime(), обязательно нужен TimedMessage
        logger.addMessage(timedMessage);
        logger.addMessage(new Message("WARN", "Test warning"));

        for (Message message : logger.getMessages()) {
            System.out.println(message);
        }

        System.out.println("===INFO===");
        for (Message message : logger.getMessages("INFO")) {
            // message.level = "SMTH"; -- ошибка. Хотя поле level указано как protected, оно не в этом package
            System.out.println(message);
        }

        System.out.println("===WARNINGS===");
        for (Message message : logger.getMessages("WARN")) {
            System.out.println(message);
        }
    }
}
