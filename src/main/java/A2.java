public class A2 {
    public static void main(String[] args) {
        int i;
        int hap = 0;

        for (i = 1; i < 11; i++) {
            if (i % 4 != 0) {
                hap = hap + i;
            }
        }
        System.out.print(hap);
    }
}
