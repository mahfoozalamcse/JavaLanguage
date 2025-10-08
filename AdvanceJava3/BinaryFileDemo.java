package AdvanceJava3;

import java.io.*;

public class BinaryFileDemo {
    public static void main(String[] args) throws IOException {
        // Write bytes
        try (FileOutputStream fos = new FileOutputStream("data.bin")) {
            fos.write(new byte[]{1, 2, 3, 4, 5});
        }

        // Read bytes
        try (FileInputStream fis = new FileInputStream("data.bin")) {
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print(b + " ");
            }
        }
    }
}
