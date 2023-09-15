package ch13generic.lecture;

public class C02generic {
    MyClass02<Object> o1 = new MyClass02<Object>();
    MyClass02<String> o2 = new MyClass02<String>();
    MyClass02<Integer> o3 = new MyClass02<Integer>();
    MyClass02<Boolean> o4 = new MyClass02<Boolean>();
    MyClass02<Object> o5 = new MyClass02<>(); //뒤에 타입은 생략 가능


}


//generic type
class MyClass02<T> {
    private T a;

}