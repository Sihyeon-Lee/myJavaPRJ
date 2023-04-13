package baekjoon;

import java.util.Scanner;

public class B_13_2750 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int[] aa = new int[a];

        for (int i = 0; i < a; i++) {
            aa[i]=s.nextInt();
        }

        for (int k = 0; k < a - 1; k++) {
            for (int j = 0; j < a - 1 - k; j++) {
                if (aa[j] > aa[j + 1]) {
                    int b = aa[j];
                    aa[j] = aa[j + 1];
                    aa[j + 1] = b;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < a; i++) {
            System.out.println(aa[i]);
        }
    }
}
