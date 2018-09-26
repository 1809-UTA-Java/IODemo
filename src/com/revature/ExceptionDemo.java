package com.revature;

import java.util.zip.ZipException;

/**
 * In exception handling, a try block must always be followed
 * by EITHER a catch or a finally block. Catch is for 
 * catching specific exceptions, while finally is a block
 * that will run always after either try or catch.
 * 
 * For multiple catch blocks, you should list them in order
 * of most specific to least specific exception.
 * 
 * Checked exceptions are checked by javac at compile time
 * Unchecked exceptions occur at runtime
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            throw new MyException("Hello");
        } catch (NullPointerException ex) {
            System.out.println("catch");
        } catch (MyException ex) {
            //System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch(Exception ex) {
            System.out.println("generic catch");
        } finally {
            System.out.println("finally");
        }
        
        try {
            doesThing();
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void doesThing() throws MyException {
        throw new MyException("throwing an exception, you deal");
    }
}