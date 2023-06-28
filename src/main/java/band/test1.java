package band;

public class test1 {
    public static void main(String[] args) {

        int i, k;
// 구구단을 표현할 곱하기 앞 뒤로 표현 할 i, k값 선언
        for (i = 2, k = 1;  i < 10;  k++) {
            //반복문 for문을 사용하여 구구단 출력
            //초기값 :  2~9단을 표현할 i값을 2로 선언, 곱하기 뒤에 올 1~9까지의 수를 표현할 k값을 1로 선언
            //조건식 : 9단까지 출력해야 하므로 i는 10보다 작을때까지 돌아가도록 선언
            //증감식 : 위 조건식이 참일때 k값이 증가하도록 증가연산자 선언

            System.out.printf(i + "X" + k + "=" + i*k + "\n");
            // 위의 for문이 참일때 출력될 내용

            if (k == 9) {
                // if문을 사용하여 for문 하나로 9단까지 출력하려고 함
                // k값이 9까지 됐을때 실행
                i++;
                k = 0;
                // i값 증가하고 k값은 초기화하여 1~9까지 다시 반복
                System.out.printf("\n");
                // 단이 끝나면 행 넘김
            }
        }
    }
}
