package HW_7;


public class Main {
    public static void main(String[] args) {
        FileNavigator fileNavigator = new FileNavigator();
        FileData fileData = new FileData("fileName", (byte) 100, "\\src");
        FileData fileData1 = new FileData("fileName1", (byte) 75, "\\src");
        FileData fileData2 = new FileData("fileName2", (byte) 80, "\\src");
        FileData fileData3 = new FileData("fileName3", (byte) 50, "\\src1");

        // add
        fileNavigator.add(fileData);
        fileNavigator.add(fileData1);
        fileNavigator.add(fileData2);
        fileNavigator.add(fileData3);

        // find
        for (FileData file :
                fileNavigator.find("\\src")) {
            System.out.println("Имя файла: " + file.getFileName() + ". Путь: " + file.getFilePath() + ". (find)");
        }
        for (FileData file :
                fileNavigator.find("\\src1")) {
            System.out.println("Имя файла: " + file.getFileName() + ". Путь: " + file.getFilePath() + ". (find)");
        }

        // filterBySize
        for (FileData file :
                fileNavigator.filterBySize((byte) 75)) {
            System.out.println("Имя файла: " + file.getFileName() + ". Размер файла: " + file.getFileSize() + " байтов. (filterBySize)");
        }
        for (FileData file :
                fileNavigator.filterBySize((byte) 100)) {
            System.out.println("Имя файла: " + file.getFileName() + ". Размер файла: " + file.getFileSize() + " байтов. (filterBySize)");
        }

        // sortBySize
        for (FileData file :
                fileNavigator.sortBySize()) {
            System.out.println("Имя файла: " + file.getFileName() + ". Размер файла: " + file.getFileSize() + " байтов. (sortBySize)");
        }

        // remove
        fileNavigator.remove("\\src1");
    }
}
