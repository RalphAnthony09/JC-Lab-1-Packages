package org.example.main;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();
        ClassThree three = new ClassThree();

        out.println(one.greet());
        out.println(two.greet());
        out.println(three.greet());

    }
}