package ch16lambda.book;

import ch07extends.book.sec04.exam02.B;

public class Example {
    public static void main(String[] args) {
        Button btn0k = new Button();
        btn0k.setClickListener(() -> System.out.println("OK버튼을 클릭했습니다."));
        btn0k.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
        btnCancel.click();
    }
}
