package HW_7;

import java.util.*;

public class FileNavigator {
    private final Map<String, ArrayList<FileData>> paths = new HashMap<>();

    void add(String filePath, FileData file) {
        ArrayList<FileData> a = new ArrayList<>();
        if (paths.containsKey(filePath)) {
            a.add(paths.get(filePath).get(0));
        }
        a.add(file);
        paths.put(filePath, a);
    }

    ArrayList<FileData> find(String filePath) {
        return paths.get(filePath);
    }

    ArrayList<FileData> filterBySize(byte maxFileSize) {
        Collection<ArrayList<FileData>> values = paths.values();
        ArrayList<FileData> files = new ArrayList<>();
        for (List<FileData> a :
                values) {
            for (FileData file :
                    a) {
                if (file.getFileSize() <= maxFileSize) {
                    files.add(file);
                }
            }
        }
        // 6 пункт
        files.sort(Comparator.comparing(FileData::getFileSize));
        return files;
    }

    void remove(String path) {
        if (paths.containsKey(path)) {
            paths.remove(path);
            System.out.println("Путь удален.");
        } else {
            System.out.println("Путь не существует.");
        }
    }

}
