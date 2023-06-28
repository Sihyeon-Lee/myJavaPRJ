package hjw;

import java.util.Scanner;

public class H_1_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int hap = 0;
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            hap += i;
        }
        System.out.print(hap);
    }
}
//백준 8393번 문제