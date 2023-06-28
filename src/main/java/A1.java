public class A1 {
    public static void main(String[] args) {
        int i, k;

        for (i = 3; i < 9; i++) {
            for (k = 1; k < 10; k++) {
                System.out.printf(i + "X" + k + "=" + i*k + "\n");
            }
            System.out.println();
        }
    }
}
