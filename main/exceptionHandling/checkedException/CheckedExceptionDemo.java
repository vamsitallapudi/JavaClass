package main.exceptionHandling.checkedException;

import java.io.FileInputStream;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        readFile("D:\\files\\secrets\\vamsi.txt", true);

    }

    private static void readFile(String fileName, boolean retry) {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            int m;
            while((m= fis.read())!= -1) {
                System.out.print((char)m);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Falling back to a default file");
            if(retry) {
                String defaultName = "D:\\files\\secrets\\test1.txt";
                readFile(defaultName,true);
            }
        }
    }
}
