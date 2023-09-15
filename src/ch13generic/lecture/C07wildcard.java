package ch13generic.lecture;

public class C07wildcard {
    MyClass07<? extends Animal> o1 = new MyClass07<Dog>();

}
class MyClass07<T>{

}
class Animal{}
class Dog extends Animal{}