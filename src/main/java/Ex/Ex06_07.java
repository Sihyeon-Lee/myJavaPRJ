package Ex;

public class Ex06_07 {
    public static void main(String[] args) {
        int hap = 0;
//        교재 원문 int hap; 메모리에 올라가는 값이 없으니 오류가 남
        int i;

        for (i = 1; i <= 10; i++) {
//              hap = hap + i;
            hap = hap + i;
        }

        System.out.printf(" 1에서 10까지의 합: %d \n", hap);
    }
}
//무조건 에러나는 식 => 6-8에서 에러나는거 배우기 전단계