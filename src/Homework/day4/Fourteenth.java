package Homework.day4;

import java.util.Scanner;

public class Fourteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a * a + b * b >= c * c)
                && (b * b + c * c >= a * a)
                && (a * a + c * c >= b * b));

        sc.close();
    }
}
