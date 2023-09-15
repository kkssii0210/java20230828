package ch09nested.lecture;

public class C01nested {
    public static void main(String[] args) {
        MyClass01 o1 = new MyClass01();
        MyClass01.NestedClass01 o2 = o1.new NestedClass01();
    }
}
class MyClass01 {
    class NestedClass01{}
}