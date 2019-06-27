package com.codecool;

public class Drone extends Ant {
    public Drone() {
        makeStep(initStartingPosition());
        setClass(AntClass.DRONE);
    }

}
