package logging;

import utils.Level;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerConsole implements Logger {
    @Override
    public void log(Level level, String message) {
        String colorCode;
        switch (level) {
            case DEBUG:
                colorCode = "\033[0;32m"; // Verde
                break;
            case WARNING:
                colorCode = "\033[0;33m"; // Amarelo
                break;
            case ERROR:
                colorCode = "\033[0;31m"; // Vermelho
                break;
            default:
                colorCode = "\033[0m"; // Default
        }
        System.out.println(colorCode + level + ": " + message + " - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\033[0m");
    }
}