package HW_7;

import java.util.*;

public class FileNavigator {
    private final Map<String, ArrayList<FileData>> paths = new HashMap<>();

    void add(FileData file) {
        if (paths.containsKey(file.getFilePath())) {
            paths.get(file.getFilePath()).add(file);
        } else {
            paths.put(file.getFilePath(), new ArrayList<>());
            paths.get(file.getFilePath()).add(file);
        }
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

    // 6 пункт
    ArrayList<FileData> sortBySize() {
        Collection<ArrayList<FileData>> values = paths.values();
        ArrayList<FileData> files = new ArrayList<>();
        for (List<FileData> a :
                values) {
            files.addAll(a);
        }
        files.sort(Comparator.comparing(FileData::getFileSize));
        return files;
    }
}
