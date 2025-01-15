package twentyfour.fall.oop.group1.finalproject.m23w7436;

import java.io.*;
import java.util.List;

public class FileHandler {
    private static final String FILE_NAME = "students_data.txt";

    public void saveStudentsToFile(List<Student> students) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
            for (Student student : students) {
                writer.write(student.toFileString());
                writer.newLine();
            }
            writer.close();
            System.out.println("Data saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public void loadStudentsFromFile(List<Student> students) {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                students.add(Student.fromFileString(line));
            }
            reader.close();
            System.out.println("Data loaded successfully!");
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
