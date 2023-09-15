package c12api.lecture;

public class C18regex {
    // regular expression : 정규표현식
    // 문자열의 패턴을 나타내는 기호들
    public static void main(String[] args) {
        "x".matches("x");

        String pattern = "^[^0-9][a-zA-Z_\\$]*$";
        System.out.println("pattern".matches(pattern));
        System.out.println("123sdafmkl".matches(pattern));
        System.out.println("123_$$$".matches(pattern));
        System.out.println("_$$$".matches(pattern));
        System.out.println("-------------------------------");
        String callPattern = "^\\d{2,3}-?\\d{3,4}-?\\d{4}$";
        System.out.println("01023342342".matches(callPattern));
        //이메일 패턴
        //영문소문자, 숫자가 여러개 @ 영문소문자,숫자 여러개 . 영문소문자,숫자가 여러개
        String emailPattern = "^[a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+$";
    }
}
