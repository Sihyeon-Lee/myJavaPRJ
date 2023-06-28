package Ex;

public class Ex06_14_01 {
    public static void main(String[] args) {
        int i, k;

        for (i = 2; i < 10; i++)
        {
            System.out.printf(i + "단 시작합니다.\n");

            for (k = 1; k < 10; k++)
            {
                System.out.printf(i + " X " + k + " = " + i * k + "\n");
//                System.out.printf("%d X %d = %d \n", i, k, i * k); => 교재 수식
            }

            System.out.printf(i + "단 끝났습니다.\n");
            System.out.printf("\n");
        }

    }
}
