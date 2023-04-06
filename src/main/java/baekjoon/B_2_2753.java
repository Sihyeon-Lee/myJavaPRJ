package baekjoon;

import java.util.Scanner;

public class B_2_2753 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year = s.nextInt();

        boolean a = (year % 4 == 0 && year % 100 != 0);
        boolean b = (year % 400 == 0);

        int c = 1, d = 0;

        System.out.print ( a | b ? c : d );
    }
}
