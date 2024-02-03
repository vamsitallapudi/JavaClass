package main.practice.codeChef;

import java.util.Scanner;

public class PassTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a < 10) {
                System.out.println("FAIL");
                continue;
            }
            if (b < 10) {
                System.out.println("FAIL");
                continue;
            }
            if (c < 10) {
                System.out.println("FAIL");
                continue;
            }
            int m = a + b + c;
            if (m < 100) {
                System.out.println("FAIL");
            } else {
                System.out.println("PASS");
            }

        }
    }
}
