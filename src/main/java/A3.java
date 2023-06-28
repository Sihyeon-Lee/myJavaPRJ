import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int a = s.nextInt();

        if (a % 2 == 0) {
            System.out.print("짝수입니다");
        } else
            System.out.print("홀수입니다");


    }
}
