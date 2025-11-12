package edu.unc.comp301.decorator.afternoonCoach;

public class Bill implements Coach{
    @Override
    public String getDescription() {
        return "Bill is a football coach";
    }
}
