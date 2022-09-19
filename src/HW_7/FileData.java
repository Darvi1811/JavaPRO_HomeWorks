package HW_7;

public class FileData {
    private final String fileName;
    private final byte fileSize;
    private final String filePath;

    public FileData(String fileName, byte fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    public String getFileName() {
        return fileName;
    }

    public byte getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }
}
