package com.api.serial;

import java.io.FileReader;
import java.io.FileWriter;

public class TryWithResourses {
    public static void main(String[] args) {

        try {
            fileWriter = new FileWriter("trail1.txt");
            fileReader = new FileReader("demo.txt");
            int num = fileReader.read();
            fileWriter.write((char) num);
            do {
                num = fileReader.read();
                fileWriter.write((char) num);
            } while (num != -1);
        }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
