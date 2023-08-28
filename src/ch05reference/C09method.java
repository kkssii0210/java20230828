package ch05reference;

public class C09method {

	public static void main(String[] args) {
		int a = 5;
		method1(a);
		int b = 50;
		method1(b);
		int c[] = {3,4,5};
		System.out.println("메인에서");
		System.out.println(System.identityHashCode(c));
		method2(c);
		System.out.println("메소드 호출 후");
		System.out.println(c[0]);


	}
	public static void method1(int p) {
		System.out.println(p);
	}
	public static void method2(int p[]) {
		System.out.println("메소드 1에서");
		System.out.println(System.identityHashCode(p));
		System.out.println(p[0]);
		
		p[0]=33;
	}

}
