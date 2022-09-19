package HW_7;


public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData fileData = new FileData("fileName", (byte) 100, "\\src");
        FileData fileData1 = new FileData("fileName1", (byte) 75, "\\src");
        FileData fileData2 = new FileData("fileName2", (byte) 50, "\\src1");

        // add
        fileNavigator.add(fileData.getFilePath(), fileData);
        fileNavigator.add(fileData1.getFilePath(), fileData1);
        fileNavigator.add(fileData2.getFilePath(), fileData2);

        // find
        for (FileData file :
                fileNavigator.find("\\src")) {
            System.out.println("Имя файла: " + file.getFileName() + ".");
        }
        for (FileData file :
                fileNavigator.find("\\src1")) {
            System.out.println("Имя файла: " + file.getFileName() + ".");
        }

        // filterBySize
        for (FileData file :
                fileNavigator.filterBySize((byte) 75)) {
            System.out.println("Имя файла: " + file.getFileName() + ". Размер файла: " + file.getFileSize() + " байтов.");
        }
        for (FileData file :
                fileNavigator.filterBySize((byte) 100)) {
            System.out.println("Имя файла: " + file.getFileName() + ". Размер файла: " + file.getFileSize() + " байтов.");
        }

        // remove
        fileNavigator.remove("\\src1");
    }
}
