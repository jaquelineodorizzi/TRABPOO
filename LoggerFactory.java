package TRABPOO;

public class LoggerFactory {
    public static Logger onConsole() {
        return new LoggerConsole();
    }

    public static Logger onFile() {
        return new LoggerFile();
    }
}
