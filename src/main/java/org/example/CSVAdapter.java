package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVAdapter implements DataSourceAdapter {
    @Override
    public String fetchData() {
        List<Student> students = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/students.csv"));
            for (int i = 1; i < lines.size(); i++) { // skip header
                String[] parts = lines.get(i).split(",");
                String name = parts[0];
                int score = Integer.parseInt(parts[1]);
                students.add(new Student(name, score));
            }
        } catch (IOException e) {
            return "Error reading CSV file.";
        }

        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}
