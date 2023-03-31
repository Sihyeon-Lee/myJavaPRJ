public class Quiz_1 {
    public static void main(String[] args) {
        int i, k;

        for (i = 2, k = 1; i < 10; k++)
        {
            System.out.printf(i + " X " + k + " = " + i * k + "\n");
                if (k == 9) {
                    i++;
                    k = 0;
                    System.out.printf("\n");
                }
        }
            System.out.printf("\n");
    }

}
