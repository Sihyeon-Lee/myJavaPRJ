package Ex;

public class Ex09_04 {
    public static void main(String[] args) {
        String str = "Java를 공부하는 중, Java는 재밌어요.^^";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java")); //0
//        앞에서부터 위치찾는 함수 indexOf
        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java")); //14
//        뒤에서부터 위치찾는 함수 lastIndexOf
//        컴퓨터는 0부터 숫자 세기 시작, 공백 포함해서 셈
    }
}
