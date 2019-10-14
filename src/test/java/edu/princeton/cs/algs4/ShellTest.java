package edu.princeton.cs.algs4;

import org.junit.jupiter.api.Test;

public class ShellTest extends BaseTest {

    @Test
    void sort() {
        Integer[] a  = newIntegerArray(10000, 100);
        Shell.sort(a);
        display(a);
    }
}