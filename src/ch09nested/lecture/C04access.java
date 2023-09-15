package ch09nested.lecture;

public class C04access {
    //static 멤버는 instance멤버에 접근할 수 없다.
    int instanceField;
    static int staticField;
    class InnerClass {
        void method1(){
            System.out.println(instanceField);
            System.out.println(staticField);
        }
    }
    static class StaticNestedClass {
        void method1() {
//            System.out.println(instanceField); 얘는 불가능
            System.out.println(staticField);
        }
    }
}
