package ch11exception.lecture;

public class C09catch {
    public static void main(String[] args) {

        try {
            int[] arr = {1, 0};
            int i = 3 / arr[0];
        } catch (ArithmeticException e){
            System.out.println("잘못된 산술연산!!");
        }catch (IndexOutOfBoundsException e){
            System.out.println("잘못된 인덱스 참조");
        }
    }
}
