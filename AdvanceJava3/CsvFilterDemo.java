package AdvanceJava3;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CsvFilterDemo {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("employees.csv"));
        List<String> filtered = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(",");
            double salary = Double.parseDouble(parts[2]);
            if (salary > 50000) filtered.add(line);
        }
        Files.write(Paths.get("high_salary.csv"), filtered);
        System.out.println("Filtered employees written to high_salary.csv");
    }
}


