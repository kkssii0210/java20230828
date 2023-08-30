package ch08extends.lecture;

public class C15cast {
    public static void main(String[] args) {
        Animal15 ani1 = new Animal15();
        Animal15 ani2 = new Animal15();
        Dog15 d1 = (Dog15) ani1;
        Cat15 c1 = (Cat15) ani2;

    }
}
class Animal15 {

}
class Dog15 extends Animal15 {}
class Cat15 extends Animal15 {}