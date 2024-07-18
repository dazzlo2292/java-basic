package ru.otus.java.basic.homeworks.homework22.junit;

import java.util.Arrays;

public class MainHomework22 {
    public static void main(String[] args) {
        int[] array = new int[] {0,1,1,2,3,5,8};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(Methods.createNewArrayAfterLastOne(array)));

        System.out.println(Methods.checkArray(new int[] {1,2}));
        System.out.println(Methods.checkArray(new int[] {1,1}));
        System.out.println(Methods.checkArray(new int[] {1,3}));
        System.out.println(Methods.checkArray(new int[] {1,2,2,1}));
    }
}
