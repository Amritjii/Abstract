package ChatGPT;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("D:/Drives/example.txt");
            
            int data;
            while ((data = inputStream.read()) != -1) {
                // Process the byte read from the file
                System.out.print((char) data);
            }
            
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




