package ch07extends.lecture.package1;

import ch07extends.lecture.MyClass30;

public class C31accessModifier  extends MyClass30 {
    public static void main(String[] args) {
        C31accessModifier o1 = new C31accessModifier();
        o1.protectedMethod();


    }

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
        System.out.println("상속");
    }
}

