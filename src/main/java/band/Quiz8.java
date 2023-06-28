package band;

import java.util.Scanner;

public class Quiz8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int aa[] = new int[5];

        System.out.print("입력값 : "); //입력값은 1,2,3,1,4 항상 동일하게 입력한다고 가정
        for (int i = 0; i < aa.length; i++) { //for문을 돌려 5개의 숫자를 입력받음
            aa[i] = s.nextInt();
            for (int k = 0; k < i; k++) { //중복검사 for문을 하나 더 돌림
                if (aa[i] == aa[k]) { // if 조건으로 같은 숫자가 발견이 되는 조건을 걸음
                    aa[i] = 0; //같은 숫자는 0으로 바꿔줌
                }
            }
        }

        System.out.print("저장된 값은 ");
        for (int i = 0; i < 5; i++) { //for문을 돌려 입력받은 숫자를 나오게 함
            if (aa[i] == 0) {
                continue; // if 조건을 걸어 0값으로 바뀐게 있다면 출력하지 않고 for문으로 다시 돌아가게 함
            }
            System.out.print(aa[i] + " "); //배열에 저장된 값이 출력되고 뒤에 공백을 표시해줌
            }
        System.out.print("입니다.");
    }
}
