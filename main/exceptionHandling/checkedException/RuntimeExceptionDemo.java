package main.exceptionHandling.checkedException;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        String a = null;
        String[] s = a.split("n");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
