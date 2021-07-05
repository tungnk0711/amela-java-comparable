package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpsonSorting {
    public static void main(String[] args) {
        ArrayList<Simpson> simpsons = new ArrayList<>();

        simpsons.add(new Simpson("Homer "));
        simpsons.add(new Simpson("Marge "));
        simpsons.add(new Simpson("Bart "));
        simpsons.add(new Simpson("Lisa "));

        /*simpsons.add(new Simpson("Homer ", 10));
        simpsons.add(new Simpson("Marge ", 30));
        simpsons.add(new Simpson("Bart ",70));
        simpsons.add(new Simpson("Lisa ",20));*/

        Collections.sort(simpsons);

        for (Simpson i: simpsons) {
            System.out.println(i.name +",");
        }
    }
}
