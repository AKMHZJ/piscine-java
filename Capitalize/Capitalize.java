import java.io.*;

public class Capitalize {

    public static void capitalize(String[] args) throws IOException {
        
        if (args.length < 2) {
            System.err.println("Usage: java Capitalize <source_file> <destination_file>");
            return;
        }

        String input = args[0];
        String output = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {

            String line;
            
            while ((line = reader.readLine()) != null) {
                
                String[] words = line.trim().split("\\s+");
                StringBuilder resultBuilder = new StringBuilder();

                for (String word : words) {
                    if (!word.isEmpty()) {
                        if (resultBuilder.length() > 0) {
                            resultBuilder.append(" ");
                        }
                        
                        resultBuilder.append(Character.toUpperCase(word.charAt(0)));
                        resultBuilder.append(word.substring(1).toLowerCase());
                    }
                }
                
                writer.write(resultBuilder.toString());
                
                writer.newLine(); 
            }
        }
        catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}