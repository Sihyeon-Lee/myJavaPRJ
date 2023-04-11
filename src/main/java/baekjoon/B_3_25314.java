package baekjoon;

import java.util.Scanner;

public class B_3_25314 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();

        for ( ;a > 3; a-=4) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
