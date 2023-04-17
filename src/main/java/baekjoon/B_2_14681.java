package baekjoon;

import java.util.Scanner;

public class B_2_14681 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        if (a > 0 && b > 0) {
            System.out.print("1");
        } else if (a > 0 && b < 0) {
            System.out.print("4");
        } else if (a < 0 && b < 0) {
            System.out.print("3");
        } else if (a < 0 && b > 0) {
            System.out.print("2");
        }
    }
}
