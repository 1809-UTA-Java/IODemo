package com.revature.serialize;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class SerializableIODemo {
    public static void main(String[] args) {
        String filename = "serial";
        Hat h = new Hat("tophat", 50);
    
        System.out.println(h);

        writeObject(filename, h);
        readObject(filename);
    }

    static void writeObject(String filename, Object obj) {
        try(ObjectOutputStream oos = 
            new ObjectOutputStream(
                new FileOutputStream(filename))) {
                    oos.writeObject(obj);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
    }

    static void readObject (String filename) {
        try (ObjectInputStream ois =
            new ObjectInputStream(
                new FileInputStream(filename)
            )) {
                Object obj = ois.readObject();
                System.out.println(obj);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
    }
}