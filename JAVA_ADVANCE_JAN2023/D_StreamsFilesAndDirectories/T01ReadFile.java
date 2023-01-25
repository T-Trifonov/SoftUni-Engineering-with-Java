package D_StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class T01ReadFile {
    public static void main(String[] args) throws IOException {

        String filepath = "C:\\input.txt";

        InputStream inputStream = new FileInputStream(filepath);

        int firstByte = inputStream.read();

        while (firstByte >= 0) {
            System.out.print(Integer.toBinaryString(firstByte) + " ");

            firstByte = inputStream.read();
        }


        inputStream.close();

    }
}
