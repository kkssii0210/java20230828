package ch09nested.lecture;

public class C07LocalClass {
    void method(){
        int value = 0;
        class LocalClass{
            void method1(){
                System.out.println(value);
            }
        }
    }

    void method2(int param) {
        class LocalClass {
            void method() {
                System.out.println(param);
            }
        }
    }
}


