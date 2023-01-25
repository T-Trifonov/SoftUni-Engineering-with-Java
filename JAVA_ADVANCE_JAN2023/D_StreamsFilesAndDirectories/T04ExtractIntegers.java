package D_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class T04ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {


        String basePath = "C:\\Users\\Tihomir\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\04_output.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        PrintStream out = new PrintStream(new FileOutputStream(outputPath));


        while (reader.hasNext()){
            if (reader.hasNextInt()){
                out.println(reader.nextInt());
            }
            reader.next();
        }

    }
}
