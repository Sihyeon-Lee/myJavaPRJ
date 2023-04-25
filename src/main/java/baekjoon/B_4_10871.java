package baekjoon;

import java.util.Scanner;

public class B_4_10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int x = s.nextInt();
        int aa[] = new int[n];

        for (int i = 0; i < n; i++) {
            aa[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (aa[i] >= x)
            {
                continue;
            }
            System.out.print(aa[i] + " ");
        }
    }
}
