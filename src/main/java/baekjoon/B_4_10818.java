package baekjoon;

import java.util.Scanner;

public class B_4_10818 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        int aa[] = new int[a];

        for (int i = 0; i < a; i++) {
            aa[i] = s.nextInt();
        }

        for (int i = 0; i < a; i++) {
            for (int k = 0; k < a - 1; k++) {
                if (aa[i] < aa[k]) {
                    int n = aa[i];
                    aa[i] = aa[k];
                    aa[k] = n;
                }
            }
        }

        System.out.print(aa[0] + " " + aa[aa.length - 1]);
    }
}
