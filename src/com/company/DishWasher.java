package com.company;

public class DishWasher {
    private boolean clean;

    public DishWasher(boolean dishesClean){
        clean = dishesClean;
    }
    public void cleanDishes(){
        setClean(true);
    }
    public void addDirty(){
        setClean(false);
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
