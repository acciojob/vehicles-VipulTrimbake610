package com.driver;

public class F1 extends Car {

    String name;
    boolean isManual;

    public F1(){

    }
    public F1(String name, boolean isManual) {
        // Use arbitrary values for parameters which are not mentioned
        this.name = name;
        this.isManual = isManual;
    }
    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; // set the value of new speed by using currentSpeed and rate
        setCurrentSpeed(newSpeed);
        /*
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            // Stop the car, set gear as 1
            changeGear(1);
        }else if(newSpeed<=50){
            changeGear(1);
        }else if(newSpeed<=100){
            changeGear(2);
        }else if(newSpeed<=150){
            changeGear(3);
        }else if(newSpeed<=200){
            changeGear(4);
        }else if(newSpeed<=250){
            changeGear(5);
        }else if(newSpeed>250){
            changeGear(6);
        }
        // for all other cases, change the gear accordingly
        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isManual() {
        return isManual;
    }

    @Override
    public void setManual(boolean manual) {
        isManual = manual;
    }
}
