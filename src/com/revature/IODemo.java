package com.revature;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class IODemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("What is your favorite color?");
        String color = sc.next();
        System.out.println(color);

        System.out.println("Tell me your favorite movies");
        //String movies = sc.nextLine();
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }
}