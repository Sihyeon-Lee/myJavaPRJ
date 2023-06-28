package band;

public class Quiz5 {
    public static void main(String[] args) {

        int i = 2, k = 0;

        while (i < 10) {
            k++;

            System.out.printf(i + "X" + k + "=" + i*k + "\n");

                if (k == 9) {
                    i++;
                    k = 0;
                    System.out.println();
                }

        }
    }
}
