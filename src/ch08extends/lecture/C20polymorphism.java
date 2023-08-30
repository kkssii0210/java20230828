package ch08extends.lecture;

import java.util.Random;

public class C20polymorphism {
    public static void main(String[] args) {
        Item item1 = getItem();
        item1.printDesc();


    }

    private static Item getItem() {
        Random random = new Random();
        int d = random.nextInt(2);
        if (d==0){
            return new Potion();
        } else {
            return new Map();
        }

//        if (d<0.5){
//            return new Potion();
//        } else {
//            return new Map();
//        }
    }
}

class Item {
    public void printDesc() {
        System.out.println("아이템 입니다.");
    }
}

class Potion extends Item {
    @Override
    public void printDesc() {
        System.out.println("포션입니다.");
    }
}

class Map extends Item {
    @Override
    public void printDesc() {
        System.out.println("지도 입니다.");
    }
}