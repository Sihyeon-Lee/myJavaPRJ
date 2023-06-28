package hjw;

import java.util.Scanner;

public class H_1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n*i);
        }
    }
}
//백준 2739번 문제 (구구단)