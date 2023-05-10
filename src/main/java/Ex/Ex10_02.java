package Ex;

public class Ex10_02 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0;
            aa[3] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("오류메세지 : " + e);
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나누는 등의 오류예요 ~~");
//            System.out.println("오류메세지 : " + e);
        } catch (Exception e) { //위치 중요, 항상 제일 마지막에 적어야함 모든걸 다 잡아주는 캐치를 먼저 쓰면 안됨
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있어요.");
            System.out.println("오류메세지 : " + e);
        } finally {
            System.out.println("이 부분은 무조건 나와요 ~~");
        }
    }
}
