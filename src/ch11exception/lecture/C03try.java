package ch11exception.lecture;

public class C03try {
    public static void main(String[] args) {
        System.out.println("code 1..");
        System.out.println("code 2..");


        try {
            //try block. exception이 발생할 수 있는 코드
            int i = 0;
            int j = 3 / i;
        } catch (ArithmeticException e) {
            //catch block 발생한 exception객체를 잡은 후 실행하는 코드
            System.out.println("오류입니다");
        }


        System.out.println("code 3..");
    }
}
