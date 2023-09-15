package ch07extends.book.sec04.exam02;

public class Child extends Parent{
    public int studentNo;
    public Child(String name,int studentNo){
        super(name,studentNo);
        this.name=name;
        this.studentNo=studentNo;
    }
}
