package baekjoon;

import java.util.Scanner;

public class B_3_10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b, c;

        for (int i = 0; i < a; i++) {
            b = s.nextInt();
            c = s.nextInt();

            System.out.println(b+c);
        }

    }
}
