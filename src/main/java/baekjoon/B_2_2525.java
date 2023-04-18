package baekjoon;

import java.util.Scanner;

public class B_2_2525 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h, m; //c를 시간이랑 분으로 나눠줄 값 h랑 m선언
        int a = s.nextInt(); //현재시각 시
        int b = s.nextInt(); //현재시각 분
        int c = s.nextInt(); //요리하는데 필요한 시간 (분단위)

        if(b + c < 60) { //현재시각 분이랑 요리하는데 필요한 시간이 합쳐져서 60분이 넘지 않으면
            System.out.print(a + " " + (b + c)); // 입력값 그대로 더해서 출력
        } else { //60분을 넘겼을 때
            h = (b + c) / 60; //h에 몫을 저장하고 (시에 추가해줄 값)
            m = (b + c) % 60; //m에 나머지를 저장한다 (분이 될 값)
            if ((a + h) >= 24) { //만약에 현재시각 시와 시에 추가해줄 값이 24시간을 넘기면
                System.out.print(((a+h)%24) + " " + m); //24로 나눠 나머지값을 시로 출력
            } else { //24시를 안 넘겼다면
                System.out.print((a+h) + " " + m); //현재시각 시와 시에 추가해줄 값을 더하고, 분을 출력
            }
        }
    }
}
