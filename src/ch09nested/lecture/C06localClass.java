package ch09nested.lecture;

public class C06localClass {
    public static void main(String[] args) {
        class LocalClass {

        }
    }
    public static void method01(){}

    public void method02() {
        class LocalClass {

        }
        LocalClass o1 = new LocalClass();
    }
}



