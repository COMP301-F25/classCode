package edu.unc.comp301.creational;

public class DragonFactory {
    private DragonFactory(){}
    public static String createDragon(DragonType type){
        switch(type){
            case ICE -> {
                return "an ICE dragon";
            }
            case FIRE -> {
                return "a FIRE dragon";
            }
            case WIND -> {
                return "a WIND dragon";
            }
            case EARTH -> {
                return "an EARTH dragon";
            }
            case LIGHTNING -> {
                return "a LIGHTNING dragon";
            }
            default -> throw new IllegalArgumentException();
        }
    }

    public static String createDragonOld(DragonType type){
        String retval = "";
        switch(type){
            case ICE:
                retval = "an ICE dragon";
                break;
            case FIRE:
                retval = "a FIRE dragon";
            break;
            case WIND:
                retval = "a WIND dragon";
                break;
            case EARTH:
                retval = "an EARTH dragon";
                break;
            case LIGHTNING:
                retval = "a LIGHTNING dragon";
                break;
            default:
                throw new IllegalArgumentException();

        }
        return retval;
    }
}
