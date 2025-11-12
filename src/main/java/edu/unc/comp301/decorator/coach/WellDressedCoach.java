package edu.unc.comp301.decorator.coach;

public class WellDressedCoach implements Coach{
    private Coach coach;

    public WellDressedCoach(Coach coach){
        this.coach = coach;
    }

    @Override
    public String getDescription() {
        return this.coach.getDescription() + " dressed from head to toe in the finest designer hoodies";
    }
}
