package com.company;

public class Goalie {

    private double reactionTime;
    private int saves;


    public Goalie(double playerReaction){
        reactionTime = playerReaction;
    }

    public boolean shotSaved(double speedOfShot) {
        double timeToGoal = 36/speedOfShot;
        return timeToGoal > reactionTime;
    }
    public void trainGoalie(){
    setReactionTime(reactionTime - 0.5);
    }


    public double getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(double reactionTime) {
        this.reactionTime = reactionTime;
    }


}
