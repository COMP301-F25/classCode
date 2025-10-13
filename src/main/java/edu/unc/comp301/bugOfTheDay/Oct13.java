package edu.unc.comp301.bugOfTheDay;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Oct13 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        Iterator<String> it = colors.iterator();

        while (it.next() != null) {
            System.out.println(it.next());// Runtime Error!
        }
    }
}
