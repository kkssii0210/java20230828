package c12api.lecture;

public class C05indexOf {
    public static void main(String[] args) {
        String a = "spring";
        String str;
        str = "spring hi  hi  hi spring hi";
        int ring = a.indexOf("ring");
        System.out.println(ring);

        System.out.println(a.indexOf("pr"));

        String b = "spring is spring";
        System.out.println(b.indexOf("ring"));

        int ring1 = b.indexOf("ring", 0);
        System.out.println(ring1);
        int result = 0;
        for (int i = 0; i < str.length()-1; i++) {
            str.indexOf("hi",i);
            if (str.indexOf("hi",i)!=str.indexOf("hi",i+1)){
                result++;
            }
        }
        System.out.println(result);
    }
}
