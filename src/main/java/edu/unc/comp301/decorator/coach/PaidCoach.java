package edu.unc.comp301.decorator.coach;

public class PaidCoach implements Coach{
    private Coach coach;

    public PaidCoach(Coach coach){
        this.coach = coach;
    }
    @Override
    public String getDescription() {
        return coach.getDescription() + " paid by UNC's quickly shrinking endowment grilling Ram's meat";
    }
}
