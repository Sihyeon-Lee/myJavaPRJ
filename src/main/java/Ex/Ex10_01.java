package Ex;

public class Ex10_01 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("오류메세지 : " + e);
        }
    }
}
