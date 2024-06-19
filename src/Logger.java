import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("[" + localDate + " " + localDateTime + " " + num++ + "] " + msg);
    }

    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
            logger.log("Создаем новый объект Logger и возвращаем его");
        } else {
            logger.log("объект Logger уже имеется, возвращаем его");
        }
        return logger;
    }

}
