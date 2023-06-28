package band;

public class Quiz_2 {
    public static void main(String[] args) {
        int i, k;

        for (i = 0, k = 1; k < 6; k++) {
            if (i < 5) {
                System.out.printf("*");
                if (i == k - 1) {
                    System.out.println();
                    k = 0;
                    i++;
                }
            }
        }
    }
}