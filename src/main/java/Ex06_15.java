public class Ex06_15 {
    public static void main(String[] args) {
        int i, k;

        for (i = 1; i < 10; i++)
        {
            for (k = 2; k < 10; k++)
            {
                System.out.printf("%4d X %d = %2d", k, i, k * i);
            }
            System.out.printf("\n");
        }
    }
}
