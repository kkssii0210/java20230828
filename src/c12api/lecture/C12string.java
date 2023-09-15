package c12api.lecture;

public class C12string {
    public static void main(String[] args) {
        String a = "java";
        String b = "spring";
        String c = "hello world";
        String d = "hi java  ";


        System.out.println(a.length()); //4
        System.out.println(b.length()); //6
        System.out.println(c.length()); //11
        System.out.println(d.length()); //9
        //text block
        String e = """
                hello world
                hi java
                greeting spring
                """;
    }
}
