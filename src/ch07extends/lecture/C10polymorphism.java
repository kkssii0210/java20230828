package ch07extends.lecture;

public class C10polymorphism {
}

class Animal10 {
    public static void main(String[] args) {
        Animal a = new Dog();  // 업캐스팅
        a.eat();  // Animal eats
        // a.bark();  // 컴파일 오류
        a.eat();
        String t = new String("java");
        int v1 = t.hashCode();
        System.out.println(System.identityHashCode(t));
        int aaa = 123;
        String bbb = "123";

    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}