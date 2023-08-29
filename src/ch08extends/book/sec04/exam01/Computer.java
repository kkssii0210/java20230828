package ch08extends.book.sec04.exam01;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r){
        System.out.println("Computer객체의 areaCirlce실행");
        return Math.PI*r*r;
    }
}
