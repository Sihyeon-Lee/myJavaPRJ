package baekjoon;

import java.util.Scanner;

public class B_3_2439 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) { //별찍기 줄 넘김을 표현할 for문
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
