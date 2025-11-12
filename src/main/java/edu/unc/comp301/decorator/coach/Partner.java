package edu.unc.comp301.decorator.coach;

public class Partner implements Coach {
    private Coach spouse;

    public Partner(Coach spouse){
        this.spouse = spouse;
    }

    @Override
    public String getDescription() {
        return spouse.getDescription() + " with his former cheerleader definitely not daughter";
    }
}
