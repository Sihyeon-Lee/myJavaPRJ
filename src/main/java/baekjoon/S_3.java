package baekjoon;

import java.util.Scanner;

public class S_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i - 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
