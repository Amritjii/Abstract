package Simple;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileGenerator {
    public static void main(String[] args) {
        double sizeInMB = 4;
        int sizeInBytes = (int) (sizeInMB * 1024 * 1024 );
        Random random = new Random();
        char[] data = new char[sizeInBytes];
        for (int i = 0; i < sizeInBytes; i++) {
            data[i] = (char) (random.nextInt(26) + 'a');
        }

        try {
            File file = new File("generated_file.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error while writing to file: " + e.getMessage());
        }
    }
}
