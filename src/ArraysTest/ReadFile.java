package ArraysTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {


    {

        try {
            FileReader file = new FileReader("path to file");
            BufferedReader reader = new BufferedReader(file);
            try {
                System.out.println(reader.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}