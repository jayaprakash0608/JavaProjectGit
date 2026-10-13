package org.github;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {

        Set<Integer> s = new TreeSet<Integer>();

        s.add(40);
        s.add(20);
        s.add(30);
        s.add(10);
        s.add(50);
        s.add(60);
        s.add(90);
        s.add(80);
        s.add(70);
        s.add(10);
        s.add(20);

        System.out.println("Enhanced Loop:");

        for (Integer i : s) {
            System.out.println(i);
        }
    }
}