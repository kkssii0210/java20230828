package ch08extends.lecture;

public class C26abstractMethod {
    public static void main(String[] args) {
        Dog26 d1 = new Dog26();
        d1.breath();

        Animal26 a1 = d1;
        a1.breath();


        Animal26 a2 = new Fish26();
        a2.breath();
    }
}


abstract class Animal26 {
    public abstract void breath();


}

class Dog26 extends Animal26 {

    @Override
    public void breath() {
        System.out.println("폐로 숨을 쉽니다.");
    }
}

class Fish26 extends Animal26 {

    @Override
    public void breath() {
        System.out.println("아가미로 숨을 쉽니다.");
    }
}