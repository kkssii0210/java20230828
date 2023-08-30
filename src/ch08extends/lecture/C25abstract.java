package ch08extends.lecture;

import ch08extends.book.sec04.exam02.C;

public class C25abstract {
    public static void main(String[] args) {
        Dog25 d1 = new Dog25();
        Cat25 c1 = new Cat25();

        Animal25 a1 = d1;
        Animal25 a2 = c1;


    }
}


abstract class Animal25 {


}

class Dog25 extends Animal25 {

}

class Cat25 extends Animal25 {

}