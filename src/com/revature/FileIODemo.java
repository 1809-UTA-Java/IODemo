package com.revature;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // try {
        //     FileWriter fw = new FileWriter(fileName);
        //     fw.write("Hi there!");
        //     fw.append("Hello");
        //     fw.close(); 
        // } catch (IOException ex) {
        //     ex.printStackTrace();
        // }

        try(FileWriter fw = new FileWriter(fileName)) {
            fw.write("Try with resources");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (FileReader fr = new FileReader(fileName)) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}