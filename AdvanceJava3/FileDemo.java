package AdvanceJava3;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");

        // Create file
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }

        // Check if file exists
        if (file.exists()) System.out.println("File exists!");

        // File info
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Writable: " + file.canWrite());

        // Delete file
        if (file.delete()) System.out.println("File deleted");
    }
}
