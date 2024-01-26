//Напишите метод, который составит строку,
//состоящую из 100 повторений слова TEST
//и метод, который запишет эту строку в простой текстовый файл,
//обработайте исключения.

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task3 {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args)
    {
        String word = "TEST";
        int n = 10;
        String filePath = "src/Lesson2/Seminar/test.txt";
        String logFilePath = "src/Lesson2/Seminar/log.txt";
        creatLog(logFilePath);
        String res = repeat(word, n);
        writeInFile(filePath, res);
        closeLogger();
    }

    static String repeat(String word, int n) {
        // return word.repeat(n + " ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append(word);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    static void creatLog(String logFilePath) {
        try {
            FileHandler handler = new FileHandler(logFilePath, true);
            logger.addHandler(handler);
            SimpleFormatter formatter = new SimpleFormatter();
            handler.setFormatter(formatter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void writeInFile(String filePath, String res) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(res);
            writer.write("\n");
            logger.info("Запись прошла успешно");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("Не удалось записать в файл");
        }
    }

    static void closeLogger() {
        Handler[] handlers = logger.getHandlers();
        for (Handler handler: handlers) {
            handler.close();
        }
    }

}