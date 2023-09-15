package c12api.lecture;

public class C16replace {
    public static void main(String[] args) {
        String a = "spring";
        String t = a.replace("sp", "abc"); //원본은 바꾸지 않고 새로운 결과값을 만든다
        System.out.println(t);
        // replaceAll : 특정 패턴을 다른 문자열로 변경
        String a1 = "JAVA is java";
        String r = a1.replaceAll("(java|JAVA)","python");
        System.out.println(r);

    }
}
