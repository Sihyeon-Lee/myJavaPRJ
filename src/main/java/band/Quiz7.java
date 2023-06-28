package band;

import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] aa = new int [5];
        int hap = 0;

        for (int i = 0; i < 5; i++) {
            aa[i] = s.nextInt();

            hap += aa[i];
        }

        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4 - j; k++) {
                if (aa[k] > aa[k + 1]) {
                    int a = aa[k];
                    aa[k] = aa[k + 1];
                    aa[k + 1] = a;
                }
            }
        }

        System.out.printf("가장 큰 값 : %d \n",aa[4]);
        System.out.printf("가장 작은 값 : %d \n", aa[0]);
        System.out.printf("평균 값 : %.1f \n", (float)hap / 5);

    }
}
