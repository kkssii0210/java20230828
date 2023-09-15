package ch13generic.book;

public class ContainExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<String, String>();
        container1.set("홍길동","도적");
        String name1 = container1.getKey();
        String job = container1.getValue();


        Container<String, Integer> container2 = new Container<String, Integer>();
        container2.set("홍길동",35);
        String name2 = container2.getKey();
        int age = container2.getValue();

    }
}


class Container<T, T1> {
    private T key;
    private T1 value;

    public T getKey() {
        return key;
    }
    public T1 getValue() {
        return value;
    }

    public void set(T key,T1 value) {
        this.key = key;
        this.value = value;
    }
}