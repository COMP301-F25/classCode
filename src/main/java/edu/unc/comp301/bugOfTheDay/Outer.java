package edu.unc.comp301.bugOfTheDay;

public class Outer {
    private String message = "Hello from Outer!";

    private class Inner implements InnerInterface{
        public  void printMessage() {
            System.out.println(message);
        }
    }

    public Inner getInner(){
        return new Inner();
    }


}