package com.driver;
import java.util.*;

public class Vehicle {
    private String name="";
    private int currentSpeed=0;
    private int currentDirection=0;
    public Vehicle() {
    }
    public Vehicle(String name) {
    }

    public Vehicle(String name, int currentSpeed, int currentDirection) {
        this.name = name;
        this.currentSpeed = currentSpeed;
        this.currentDirection = currentDirection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }


    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        setCurrentDirection(getCurrentDirection()+direction);
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }
    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }
    public void stop(){
        System.out.println("stop method called - The vehicle is stopped");
    }



}
