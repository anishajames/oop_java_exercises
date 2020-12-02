package com.techreturners.cats;

public abstract class AbstractCat implements Cat {

    boolean isAsleep = false;

    public void goToSleep(){
        isAsleep = true;
    }

    public void wakeUp(){
        isAsleep = false;
    }

    public boolean isAsleep() {
        return isAsleep;
    }

}