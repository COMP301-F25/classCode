package edu.unc.comp301.decorator.afternoonCoach;

public class WellDressedCoach implements Coach{
    private Coach coach;

    public WellDressedCoach(Coach coach){
        this.coach = coach;
    }

    @Override
    public String getDescription() {
        return this.coach.getDescription() + " dresesd to the 9's (aka his final score)";
    }
}
