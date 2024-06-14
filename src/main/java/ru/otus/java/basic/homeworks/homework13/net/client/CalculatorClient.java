package ru.otus.java.basic.homeworks.homework13.net.client;

import java.io.*;
import java.net.Socket;

public class CalculatorClient {
    private final DataOutputStream out;
    private final DataInputStream in;

    public CalculatorClient(Socket socket) throws IOException {
        this.out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        this.in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
    }

    public void send(String message) throws IOException {
        out.writeUTF(message);
        out.flush();
    }

    public String read() throws IOException {
        return in.readUTF();
    }
}
