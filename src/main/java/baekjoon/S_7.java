package baekjoon;

import java.util.Scanner;

public class S_7 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < i ; k++) {
                System.out.print(" ");
            }
            for (int k = ((n - i) * 2) - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
