package band;

import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[5];

        for (int i = 0; i < 5 ; i++) {
            System.out.print(i + 1 + "번째 숫자를 입력하세요: ");
            aa[i] = s.nextInt();

            for (int k = 0; k < i; k++) {
                if (aa[i] == aa[k]) {
                    System.out.println("중복된 숫자입니다.");
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int k = 0; k < 4 - i; k++) {
                if (aa[k] > aa[k + 1]) {
                    int a = aa[k];
                    aa[k] = aa[k + 1];
                    aa[k + 1] = a;

                }
            }
        }
//        버블정렬, 밖에 for문은 정렬, 반복횟수 숫자를 다섯개 받으니까 반복은 네번만 하게 설정
//        안에 for문은 숫자 비교용, for문 안에 if문을 배열의 값이 뒤에 오는 배열 숫자보다 크면 둘의 자리를 바꾸게 설정

        for (int i = 0; i < 5; i++) {
            System.out.print(aa[i] + " ");
        }
    }
}