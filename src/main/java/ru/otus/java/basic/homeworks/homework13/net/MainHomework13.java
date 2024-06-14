package ru.otus.java.basic.homeworks.homework13.net;

import ru.otus.java.basic.homeworks.homework13.net.client.CalculatorClient;
import java.net.Socket;
import java.util.Scanner;

public class MainHomework13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("localhost", 8080)) {
            CalculatorClient client = new CalculatorClient(socket);
            System.out.println("Client started and connected to server");
            System.out.print(client.read());

            client.send(scanner.nextLine());

            System.out.print(client.read());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
