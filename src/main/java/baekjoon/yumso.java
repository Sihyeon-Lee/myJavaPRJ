package baekjoon;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class yumso {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            ll.add(sc.nextInt());
        }

        Collections.sort(ll, Collections.reverseOrder());
        System.out.print(ll);

    }
}
