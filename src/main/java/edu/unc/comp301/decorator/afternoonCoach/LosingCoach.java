package edu.unc.comp301.decorator.afternoonCoach;

public class LosingCoach implements Coach{
    private Coach coach;

    public LosingCoach(Coach coach){
        this.coach = coach;
    }

    @Override
    public String getDescription() {
        return coach.getDescription() + " that has not earned his paycheck";
    }
}
