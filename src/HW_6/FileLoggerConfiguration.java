package HW_6;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLoggerConfiguration {
    private static File FILE;
    private static LoggingLevel LEVEL;
    private static byte MAX_SIZE_FILE;
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("hh:mm:ss");

    public static String format(String message, LoggingLevel level) {
        return "[" + TIME_FORMAT.format(new Date()) + "]" + "[" + level + "] " + "Сообщение: " + "[" + message + "]";
    }

    public FileLoggerConfiguration(String fileName, LoggingLevel lvl, byte msf) {
        FILE = new File("src\\HW_6\\" + fileName);
        LEVEL = lvl;
        MAX_SIZE_FILE = msf;
    }

    public static File getFILE() {
        return FILE;
    }

    public static LoggingLevel getLEVEL() {
        return LEVEL;
    }

    public static byte getMaxSizeFile() {
        return MAX_SIZE_FILE;
    }
}
