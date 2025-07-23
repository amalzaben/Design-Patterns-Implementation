package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONAdapter implements DataSourceAdapter {
    @Override
    public String fetchData() {
        List<Student> students = new ArrayList<>();

        try {
            String content = new String(Files.readAllBytes(Paths.get("src/main/resources/students.json")));
            JSONObject jsonObject = new JSONObject(content);
            JSONArray studentArray = jsonObject.getJSONArray("students");

            for (int i = 0; i < studentArray.length(); i++) {
                JSONObject studentObj = studentArray.getJSONObject(i);
                String name = studentObj.getString("name");
                int score = studentObj.getInt("score");
                students.add(new Student(name, score));
            }

        } catch (IOException e) {
            return "Error reading JSON file.";
        }

        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }
}
