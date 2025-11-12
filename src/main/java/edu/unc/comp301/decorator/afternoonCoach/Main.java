package edu.unc.comp301.decorator.afternoonCoach;

public class Main {
    public static void main(String[] args){
        Coach bill = new Bill();
        bill = new WellDressedCoach(bill);
        bill = new Partner(bill);
        bill = new LosingCoach(bill);

        System.out.println(bill.getDescription());

    }
}
