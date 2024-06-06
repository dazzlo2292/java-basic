package ru.otus.java.basic.homeworks.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileOperations {
    private static final Scanner scanner = new Scanner(System.in);

    public static String selectFile() {
        System.out.println("Select file/directory (\"exit\" for quit):");
        return scanner.nextLine();
    }

    public static void readFile(String path) {
        try (InputStreamReader in = new InputStreamReader(new BufferedInputStream(new FileInputStream(path)), StandardCharsets.UTF_8)) {
            int chars = in.read();
            while (chars != -1) {
                System.out.print((char)chars);
                chars = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String path) {
        try (OutputStreamWriter out = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(path, true)))) {
            String text = scanner.nextLine() + "\n";
            byte[] buffer = text.getBytes(StandardCharsets.UTF_8);
            for (byte character : buffer) {
                out.write(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void closeScanner() {
        scanner.close();
    }
}
