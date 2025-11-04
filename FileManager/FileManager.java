import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        FileWriter file = new FileWriter(fileName);
        file.write(content);
        file.close();
    }
    public static String getContentFile(String fileName) throws IOException {
        // your code here
        // FileReader file = new FileReader(fileName);
        // file.read();
        Path filePath = Paths.get(fileName);
        String fileContent = Files.readString(filePath);
        return fileContent;
    }
    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}