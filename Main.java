package Main;

import logging.Logger;
import utils.Level;

public class Main {
    public static void main(String[] args) {
        Logger loggerConsole = LoggerFactory.onConsole();
        Logger loggerFile = LoggerFactory.onFile();

        loggerConsole.log(Level.DEBUG, "Esta é uma mensagem de debug");
        loggerConsole.log(Level.WARNING, "Esta é uma mensagem de aviso");
        loggerConsole.log(Level.ERROR, "Esta é uma mensagem de erro");

        loggerFile.log(Level.DEBUG, "Esta é uma mensagem de debug");
        loggerFile.log(Level.WARNING, "Esta é uma mensagem de aviso");
        loggerFile.log(Level.ERROR, "Esta é uma mensagem de erro");
    }
}