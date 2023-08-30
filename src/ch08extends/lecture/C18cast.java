package ch08extends.lecture;

public class C18cast {
    public static void main(String[] args) {
        Animal18 ani1 = new Dog18();
        Animal18 ani2 = new Cat18();
        if (ani1 instanceof Dog18 d1){
            d1.bark();
        }else {
            System.out.println("형변환 안댐");
        }
        if (ani2 instanceof Cat18 c1){
            c1.meow();
        }else {
            System.out.println("형변환 안댐");
        }
    }
}

class Animal18 {}
class Dog18 extends Animal18{
    public void bark(){
        System.out.println("멍멍");
    }
}
class Cat18 extends Animal18{
    public void meow(){
        System.out.println("야옹");
    }
}