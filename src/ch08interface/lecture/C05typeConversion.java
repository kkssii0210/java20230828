package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;
        Number n = i;
        Object m = i;
        ConstantDesc b = i;
        Constable v = i;
        Comparable<Integer> c = i;
        java.io.Serializable x = i;
        Serializable z = i;


    }
}

