package baekjoon;

import java.util.Scanner;

public class B_4_10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int hap = 0; //같은수를 합해줄 저장값 선언
        int a = s.nextInt(); //배열값 개수를 정해줄 정수 입력받는 a 선언

        int[] aa = new int [a]; //배열 aa 선언하고 배열은 입력받은 a만큼 자리를 줌

        for (int i = 0; i < a; i++) {
            aa[i] = s.nextInt();
        } //for문을 돌려 배열의 개수만큼 숫자를 입력받음

        int b = s.nextInt(); //같은 숫자를 찾아낼 정수를 입력받을 b 선언

        for (int k = 0; k < a; k++) { //for문으로 반복하여 배열 안 숫자 확인
            if (aa[k] == b) { //if문을 선언해 배열 안에 숫자가 b와 같다면 돌아간다는 조건 입력
                hap += 1; // 조건이 성립하면 hap에 1씩 더해줌
            }
        }
        System.out.print(hap); //최종 출력은 배열 안에 숫자 중 b와 겹치는 숫자가 몇개인지 합해준 hap을 출력함
    }
}
