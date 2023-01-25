package D_StreamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class T08NestedFolders {

    public static void main(String[] args) {

        String folderPath = "C:\\Users\\Tihomir\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File root = new File(folderPath);

        Deque<File> directories = new ArrayDeque<>();
        directories.offer(root);

        int count = 1;

        while (!directories.isEmpty()) {
            File current = directories.poll();
            File [] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()){
                    directories.offer(nestedFile);
                    count++;

                }

            }

            System.out.println(current.getName());
        }

        System.out.println(count + " folders");

    }

}
