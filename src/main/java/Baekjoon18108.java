import java.util.Scanner;

public class Baekjoon18108 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a, b;
//        불기연도 입력받을 a값과 서기연도 출력할 b값 선언

        System.out.print("태국의 불기 연도를 입력하세요 (숫자만) : ");
        a =  s.nextInt();
//        불기연도 입력받을 함수 입력
        b = a - 543;
//        서기연도는 태국 불기연도 - 543년 (일부 나라만 - 544년이라함)

        System.out.printf("해당 연도의 서기연도는 %d년 입니다.\n", b);
//        서기연도로 변환한 값 출력
    }
}
