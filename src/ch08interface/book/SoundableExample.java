package ch08interface.book;

public class SoundableExample {
    public static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}

interface Soundable {
    public String sound();
}
class Cat implements Soundable {

    @Override
    public String sound() {
        return "야옹";
    }
}

class Dog implements Soundable {

    @Override
    public String sound() {
        return "멍멍";
    }
}