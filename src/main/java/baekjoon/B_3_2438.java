package baekjoon;

import java.util.Scanner;

public class B_3_2438 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for(int i = 0; i < a; i++) {
            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
