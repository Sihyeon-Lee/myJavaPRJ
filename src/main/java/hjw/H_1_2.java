package hjw;

import java.util.Scanner;

public class H_1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a+b);
        }
    }

}
//백준 10950번 문제