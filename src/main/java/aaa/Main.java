package aaa;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        int result1 = parent.cal(3, 4); // 기존 Parent의 cal 메서드 호출
        int result2 = child.cal(3, 4); // Child에서 재정의한 cal 메서드 호출

        System.out.println("Parent의 cal 결과: " + result1); // 출력: 7
        System.out.println("Child의 cal 결과: " + result2); // 출력: 12
    }
}
