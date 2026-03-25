package OOP.WriteReadFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        String filePath = "C:\\Users\\Niko Novak\\Desktop\\test.txt";
        String textContent = """
                Roses are red,
                I don't know how to cook,
                hammocks are cool,
                but with a good book.
                """;

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written.");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location.");
        }
        catch(IOException e){
            System.out.println("Could not write file.");
        }
    }
}

// Write file in Java
// FileWriter = Good for small/medium-sized text files
// BufferedWriter = Better performance for large amounts of text
// PrintWriter = Best for structured data, like reports or logs
// FileOutputStream = Best for binary files (images, audio files)

// Read file in Java
// BufferedReader ' FileReader: Best for reading text files line-by-line
// FileInputStream: Best for binary files (e.g., images, audio files)
// RandomAccessFile: Best for read/write specific portions of a large file