package baekjoon;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class yamso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<Integer>();

        for (int i = 0; i < 5 ; i++) {
            ll.add(sc.nextInt());
        }

        Set<Integer> se = new HashSet<>(ll);

        ll.clear();
        ll.addAll(se);

        System.out.print("저장된 값은 ");
        System.out.print(ll);
        System.out.print("입니다.");

    }
}
