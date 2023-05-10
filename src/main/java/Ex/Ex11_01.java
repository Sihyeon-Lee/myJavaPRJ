package Ex;

// 가급적 public 붙여주자 !
class Car {
    public String color;
    public int speed;

    public void upSpeed(int value) {
        this.speed = speed + value;
//        this가 의미하는 건 자기자신 = Car라고 표현하는 것
    }

    public void downSpeed(int value) {
        this.speed = speed - value;
    }
}

// 자바 파일 한개당 클래스는 한개씩만 쓰는게 좋다 (교육용이라 이번만 예외인걸로...)
// 클래스 안에 클래스는 절대 못 들어감
public class Ex11_01 {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.color = "빨강";
        myCar1.speed = 0;

        Car myCar2 = new Car();
        myCar2.color = "파랑";
        myCar2.speed = 0;

        Car myCar3 = new Car();
        myCar3.color = "노랑";
        myCar3.speed = 0;

        myCar1.upSpeed(30);
        System.out.println("자동차1의 색상은 " + myCar1.color + "이며, 현재속도는 " + myCar1.speed + "km 입니다.");

        myCar2.upSpeed(60);
        System.out.println("자동차2의 색상은 " + myCar2.color + "이며, 현재속도는 " + myCar2.speed + "km 입니다.");

        myCar3.upSpeed(0);
        System.out.println("자동차3의 색상은 " + myCar3.color + "이며, 현재속도는 " + myCar3.speed + "km 입니다.");
    }
}
