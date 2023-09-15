package ch08interface.lecture;

public class C02interface {
   public static void main(String[] args) {
      MyClass021 o1 = new MyClass021();
      MyInterface02 i2 = o1;
      MyInterface02 i3 = new MyClass021();
      MyInterface02 i4 = new MyClass022();

   }
}

interface MyInterface02 {
   abstract public void method1();
   void method2();
}

class MyClass021 implements MyInterface02 {

   @Override
   public void method1() {
      System.out.println("MyClass021.method1");
   }

   @Override
   public void method2() {
      System.out.println("MyClass021.method2");
   }
}

class MyClass022 implements MyInterface02 {

   @Override
   public void method1() {
      System.out.println("123");
   }

   @Override
   public void method2() {
      System.out.println("456");
   }
}