package edu.unc.comp301.decorator.afternoonCoach;

public class Partner implements  Coach{
    private Coach coach;

    public Partner(Coach coach){
        this.coach = coach;
    }

    @Override
    public String getDescription() {
        return this.coach.getDescription() + " with his partner that is definitely not his granddaughter";
    }

}
