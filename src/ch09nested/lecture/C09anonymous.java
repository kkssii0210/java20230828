package ch09nested.lecture;

public class C09anonymous {
    public static void main(String[] args) {
        MyClass09 o1 = new MyClass09();
        //익명 클래스
        MyClass09 o2 = new MyClass09() {
            @Override
            void method1() {
                System.out.println("C09anonymous.method1");
            }
        };
    }
}

class MyClass09 {
    void method1() {
        System.out.println("MyClass09.method1");
    }
}

class MySubClass091 extends MyClass09 {


}