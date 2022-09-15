package HW_6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileLogger {
    private final OutputStream outputStream;

    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
        try {
            this.outputStream = new FileOutputStream(FileLoggerConfiguration.getFILE(), true);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void debug(String message) {
        if (FileLoggerConfiguration.getLEVEL().ordinal() >= LoggingLevel.DEBUG.ordinal()) {
            String text = FileLoggerConfiguration.format(message, LoggingLevel.DEBUG);
            writeFile(text);
        }
    }

    public void info(String message) {
        if (FileLoggerConfiguration.getLEVEL().ordinal() >= LoggingLevel.INFO.ordinal()) {
            String text = FileLoggerConfiguration.format(message, LoggingLevel.INFO);
            writeFile(text);
        }
    }

    private void writeFile(String message) {
        try {
            if (FileLoggerConfiguration.getFILE().length() < FileLoggerConfiguration.getMaxSizeFile()) {
                outputStream.write(message.getBytes(StandardCharsets.UTF_8));
                outputStream.write("\n".getBytes());
                outputStream.flush();
            } else {
                throw new FileMaxSizeReachedException("Максимальный размер файла: " + FileLoggerConfiguration.getMaxSizeFile() + "\nРазмер файла: " +
                        FileLoggerConfiguration.getFILE().length() + " байт." + "\nПуть файла: " + FileLoggerConfiguration.getFILE());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
