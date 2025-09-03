package edu.unc.comp301.reflection;

import java.lang.reflect.Field;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        TicketMaster website = new TicketMaster(1);
        website.buyTickets("Prairie");
        website.buyTickets("Uli");


        Class<?> clazz = website.getClass();
        Field field = clazz.getDeclaredField("reserved");
        field.setAccessible(true);

        Set<String> reserved = (Set<String>) field.get(website);


        reserved.clear();
        System.out.println(website.getNumTickets());
        reserved.add("Uli");


        System.out.println(website.getNumTickets());


    }
}