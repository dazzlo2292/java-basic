package ru.otus.java.basic.homeworks.homework22.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MethodsTest {

    public static Stream<Arguments> getArraysForCreateNewArray() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.of(new int[] {0,1,1,2,3,5,8}, new int[] {0,2,3,5,8}));
        return out.stream();
    }

    public static Stream<Arguments> getArraysForCheck() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.of(true, new int[] {1,2}));
        out.add(Arguments.of(false, new int[] {1,1}));
        out.add(Arguments.of(false, new int[] {1,3}));
        out.add(Arguments.of(true, new int[] {1,2,2,1}));
        return out.stream();
    }

    @Disabled
    @ParameterizedTest
    @MethodSource("getArraysForCreateNewArray")
    void arrayAfterLastOne(int[] arrayEquals, int[] arrayException) {
        Assertions.assertArrayEquals(new int[] {2,3,5,8}, Methods.createNewArrayAfterLastOne(arrayEquals));
        Assertions.assertThrowsExactly(RuntimeException.class, ()-> Methods.createNewArrayAfterLastOne(arrayException));
    }

    @Test
    void arrayAfterLastOne() {
        Assertions.assertAll(
                ()-> {
                    Assertions.assertArrayEquals(new int[] {2,3,5,8}, Methods.createNewArrayAfterLastOne(new int[] {0,1,1,2,3,5,8}));
                },
                ()-> {
                    Assertions.assertThrowsExactly(RuntimeException.class, ()-> Methods.createNewArrayAfterLastOne(new int[] {0,2,3,5,8}));
                }
        );
    }

    @ParameterizedTest
    @MethodSource("getArraysForCheck")
    void checkArray(boolean result, int[] array) {
        Assertions.assertEquals(result, Methods.checkArray(array));
    }
}