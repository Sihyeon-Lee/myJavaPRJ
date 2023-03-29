import java.util.Scanner;

public class bandquiz2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.printf("입력 값 : ");
        num = sc.nextInt();

        if (num % 2 == 0 && num % 3 == 0) {
            System.out.printf("2의 배수와 3의 배수를 만족합니다.\n");
        } else if (num % 2 == 0) {
            System.out.printf("2의 배수입니다.\n");
        } else if (num % 3 == 0) {
            System.out.printf("3의 배수입니다.\n");
        } else {
            System.out.printf("2의 배수와 3의 배수 둘 다 만족하지 않습니다.\n");
        }


    }
}
