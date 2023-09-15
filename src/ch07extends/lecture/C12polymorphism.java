package ch07extends.lecture;

public class C12polymorphism {

}
class Animal12 {
    private void breath(){
        System.out.println("숨쉬다");
    }
}

class Malamute12 extends Animal12 {
    private void sniff() {
        System.out.println("냄새를 맡다");
    }
}