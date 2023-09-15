package ch07extends.lecture;

public class C09polymorphism {

    public static void main(String[] args) {
    MySubClass091 o1 = new MySubClass091();
    MyClass09 o2 = o1;
    o1.method1();
    o2.method1();

    }
}

class MyClass09 {
    void method1(){
        System.out.println("부모 메소드");
    }
}

class MySubClass091 extends MyClass09 {
    @Override
    void method1() {
        System.out.println("자식 메소드");
    }
}
