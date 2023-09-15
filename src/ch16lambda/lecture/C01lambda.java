package ch16lambda.lecture;

public class C01lambda {
    public static void main(String[] args) {
        MyInterface01 o1 = (x, y) -> {
            System.out.println(x+y);
        };
        o1.method1(300000000,4);
    }
}
interface MyInterface01 {
    void method1(int x, int y);
}