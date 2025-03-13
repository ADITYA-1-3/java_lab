//PROGRAM 03
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Length {
    public static void main(String[] args) {
        String filepath = "D:\\file.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            int characterCount = 0;
            int lineCount = 0;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                lineCount++;
                characterCount += line.length();
                wordCount += line.split("\\s+").length; // Correct regex for splitting words
            }

            System.out.println("Character count: " + characterCount);
            System.out.println("Line count: " + lineCount);
            System.out.println("Word count: " + wordCount);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
