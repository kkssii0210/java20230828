package ch06Class;

public class C07static {
    public static void main(String[] args) {
        MyClass08 o1 = new MyClass08();
        o1.name = "java";
        o1.printName();

        MyClass08.name = "spring";
        MyClass08.printName();

    }
}

class MyClass08 {
    static String name;

    static void printName() {
        System.out.println("name = " + name);
    }
}