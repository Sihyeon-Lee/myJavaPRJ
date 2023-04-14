package baekjoon;

import java.util.Scanner;

public class B_2_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int m = s.nextInt();


        if (m - 45 < 0) {
            if (h - 1 < 0) {
            h = 24;
            }
            System.out.printf("%d %d", h - 1, 15 + m);
        } else System.out.printf("%d %d", h, m - 45);
    }
}
