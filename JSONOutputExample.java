import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONOutputExample {
    public static void main(String[] args) {
        try {
            // Create the data object
            Data data = new Data("Sarah", 22, "Computer Science", new String[]{"Java", "Python", "JavaScript"});

            // Create an ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            // Write the data object to a JSON file
            File file = new File("data.json");
            objectMapper.writeValue(file, data);
            System.out.println("Data written to JSON file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Define the Data class
    public static class Data {
        private String name;
        private int age;
        private String course;
        private String[] skills;

        public Data(String name, int age, String course, String[] skills) {
            this.name =























            