package ru.otus.java.basic.homeworks.homework12;

import java.io.File;

public class FilesPrinter {
    private static final String rootPath = "./src/main/resources/files-hm12";
    private static String path = rootPath;

    private static final String separator = "-----------------------------------------";

    public static void printFiles() {
        File root = new File(path);

        File[] listFiles = root.listFiles();
        if (listFiles != null) {
            System.out.println(separator);
            for (File file : listFiles) {
                System.out.println(file.getName());
            }
            System.out.println(separator);
        }

        String selectedFile = FileOperations.selectFile();
        if (selectedFile.equals("exit")) {
            return;
        }
        String newPath = path + "/" + selectedFile;
        File newFile = new File(newPath);
        if (newFile.exists()) {
            if (newFile.isDirectory()) {
                path = newPath;
                printFiles();
            } else {
                FileOperations.readFile(newPath);
                FileOperations.writeFile(newPath);
                FileOperations.closeScanner();
            }
        } else {
            System.out.println("File or directory not found!");
            printFiles();
        }
    }
}
