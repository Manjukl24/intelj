package com.api.serial;

import javax.imageio.IIOException;
import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(iReader);
        System.out.println("Enter");
        char c = 0;
        FileOutputStream fileOutputStream = null;
        try {
            c = (char) bufferedReader.read();
            while (c != 'g') {
                //System.out.println(c);
                fileOutputStream.write(c);
                c = (char) bufferedReader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IIOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutStream.close();
            } catch (IOException i) {
                i.printStackTrace();
            }
        }
    }
}