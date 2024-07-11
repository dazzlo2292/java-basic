package ru.otus.java.basic.homeworks.homework20.io2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextFinder {
    private static final String ROOT_PATH = "./src/main/resources/files-hm20";

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of file:");
        String selectedFile = scanner.nextLine();
        String path = Paths.get(ROOT_PATH, selectedFile).toString();

        System.out.println("Enter text:");
        String text = scanner.nextLine();

        System.out.println(findText(path, text));
    }

    private static int findText(String path, String text) {
        int count = 0;

        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path))) {
            byte[] input = bufferedInputStream.readAllBytes();
            String data = new String(input, StandardCharsets.UTF_8);

            int index = 0;
            while (data.indexOf(text, index) != -1) {
                count++;
                index = data.indexOf(text, index) + text.length();
            }

            //count = (data.length() - data.replace(text, "").length()) / text.length();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return count;
    }
}
