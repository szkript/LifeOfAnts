package com.codecool;

public class Worker extends Ant {

    public Worker() {
        setPosition(initStartingPosition());
        setClass(AntClass.WORKER);
    }

    @Override
    public void makeStep() {
        //valid steps should be implemented here
        setPosition(calculateNextMove(getAntClass()));
    }

}
