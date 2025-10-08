package AdvanceJava3;

import java.io.*;

public class WriteFileDemo {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            bw.write("Hello, this is a test file.\n");
            bw.write("FAANG-level File Handling in Java.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

