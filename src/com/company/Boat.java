package com.company;

public class Boat {
    private String name;
    private int seats;
    private int passengers;
    private double averageSpeed;


    public Boat(String boatName, int boatSeats, int boatMpg, double boatAverageSpeed){
        name = boatName;
        seats = boatSeats;
        averageSpeed = boatAverageSpeed;


    }

    public String takesHowLong(int distance){
        return "The trip will take this boat " + distance/getAverageSpeed() + " hours";
    }

    public int addPassenger() {
       if(getPassengers() < getSeats()){
           setPassengers(getPassengers() + 1);
       } return getPassengers();
   }




   public String toString(){
        return ("The boat, "+getName()+" Holds "+getSeats()+" passengers and has "+getPassengers()+" passengers in it.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(double averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
