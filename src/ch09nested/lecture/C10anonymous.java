package ch09nested.lecture;

public class C10anonymous {
    MyClass10 o1 = new MySubClass101();
    MyClass10 o2 = new MyClass10() {
    };
}

class MySubClass101 extends MyClass10 {

}
abstract class MyClass10 {

}