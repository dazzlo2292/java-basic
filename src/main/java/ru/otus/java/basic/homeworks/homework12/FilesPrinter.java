package ru.otus.java.basic.homeworks.homework12;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesPrinter {
    private static final String ROOT_PATH = "./src/main/resources/files-hm12";
    private static String path = ROOT_PATH;

    private static final String SEPARATOR = "-----------------------------------------";

    public static void printFiles() {
        File root = new File(path);

        File[] listFiles = root.listFiles();
        if (listFiles != null) {
            System.out.println(SEPARATOR);
            for (File file : listFiles) {
                System.out.println(file.getName());
            }
            System.out.println(SEPARATOR);
        }

        String selectedFile = FileOperations.selectFile();
        if (selectedFile.equals("exit")) {
            return;
        }
        Path concatedPath = Paths.get(path,selectedFile);
        String newPath = concatedPath.toString();
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
