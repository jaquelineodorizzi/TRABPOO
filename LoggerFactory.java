package Main;

import logging.Logger;
import logging.LoggerConsole;
import logging.LoggerFile;

public class LoggerFactory {
    public static Logger onConsole() {
        return new LoggerConsole();
    }

    public static Logger onFile() {
        return new LoggerFile();
    }
}