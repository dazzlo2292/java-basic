package ru.otus.java.basic.homeworks.homework13.net.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class CalculatorServer {
    private static final String SEPARATOR = "------------------------------------------------\n";
    private static final String OPERATIONS = "Available operations: + , — , * , / \n";
    private static final String INPUT_FORMAT = "Input format: {Number_1} {Operation} {Number_2}\n";

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("Server started");
            while (true) {
                Socket client = server.accept();
                System.out.println("Client connected");
                send(SEPARATOR + OPERATIONS + INPUT_FORMAT + SEPARATOR, client);

                send(Float.toString(processRequest(read(client))), client);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private static void send(String message, Socket client) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
        out.writeUTF(message);
        out.flush();
    }

    private static String read(Socket client) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(client.getInputStream()));
        return in.readUTF();
    }

    private static Float processRequest(String input) throws NumberFormatException, ArrayIndexOutOfBoundsException {
        String[] elements = input.split(" ");
        float numberOne = Float.parseFloat(elements[0]);
        float numberTwo = Float.parseFloat(elements[2]);
        String operation = elements[1];

        return switch (operation) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo;
            case "/" -> numberOne / numberTwo;
            default -> -1f;
        };
    }
}
