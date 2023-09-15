package ch11exception.lecture;

public class C06finally {
    public static void main(String[] args) {
        System.out.println("code1");

        try {
            int i = 0;
            int j = 3 / i;
            System.out.println("code2");
        } catch (ArithmeticException e) {
            System.out.println("code3");
        } finally {
            System.out.println("꼭 실행 되어야 하는 코드");

        }
        System.out.println("code4");

    }
}
