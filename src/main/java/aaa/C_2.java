package aaa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C_2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(3);
        num.add(6);
        num.add(1);
        num.add(2);
        num.add(4);

        Collections.sort(num);

        num.forEach(number -> System.out.print(number + " "));
    }
}
