package HW_6;

public class Main {
    public static void main(String[] args) throws Exception {
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration("logger.txt", LoggingLevel.INFO, (byte) 90);
        FileLogger logger = new FileLogger(fileLoggerConfiguration);
        logger.debug("DEBUG");
        logger.info("INFO");
    }
}
