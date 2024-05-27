package TRABPOO;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger {
    @Override
    public void log(Level level, String message) {
        try (FileWriter fileWriter = new FileWriter("log.txt", true)) {
            fileWriter.write(level + ": " + message + " - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
