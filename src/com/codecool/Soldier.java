package com.codecool;

public class Soldier extends Ant {
    public Soldier(){
        makeStep(initStartingPosition());
        setClass(AntClass.SOLDIER);

    }

}
