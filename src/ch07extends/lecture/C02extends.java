package ch07extends.lecture;

public class C02extends {
    public static void main(String[] args) {
        MySubClass021 o1 = new MySubClass021();
        o1.name = "spring";
        o1.method03();
    }
}

class MySubClass021 extends MyClass02 {

}
class MyClass02 {
    String name;
    void method03(){
        System.out.println("MyClass02.method03");
    }
}