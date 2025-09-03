package edu.unc.comp301.reflection;
import java.util.HashSet;
import java.util.Set;

public class TicketMaster {
    private Set<String> reserved = new HashSet<>();
    private int totalTickets;

    public TicketMaster(int totalTickets){
        this.totalTickets = totalTickets;
    }

    public TicketMaster(){
        this(100);
    }

    public void buyTickets(String name){
        if(reserved.size() < totalTickets && !reserved.contains(name)){
            reserved.add(name);
            System.out.println("Tickets purchased successfully");
        } else if(reserved.contains((name))){
            System.out.println("You have already reserved a ticket");
        } else {
            System.out.println("Sorry, tickets are sold out");
        }
    }

    public int getNumTickets(){
        return totalTickets-reserved.size();
    }
}
