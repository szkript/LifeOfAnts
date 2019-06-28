package com.codecool;

public class Drone extends Ant {
    public Drone() {
        setPosition(initStartingPosition());
        setClass(AntClass.DRONE);
    }

    @Override
    public void makeStep(){
        setPosition(calculateNextMove(getAntClass()));
    }

}
