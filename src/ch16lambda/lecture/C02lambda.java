package ch16lambda.lecture;

public class C02lambda {
    public static void main(String[] args) {
        MyInterface02 o1 = () -> System.out.println("C02lambda.method");
        o1.method();

    }
}
@FunctionalInterface
interface MyInterface02 {
    void method();
}