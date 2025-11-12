package edu.unc.comp301.decorator.coach;

public class Main {
    public static void main(String[] args){
        Coach bill = new Bill();
        bill = new PaidCoach(bill);
        bill = new WellDressedCoach(bill);
        bill = new Partner(bill);

        System.out.println(bill.getDescription());

    }
}
