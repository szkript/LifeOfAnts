package com.codecool;


public class Soldier extends Ant {

    private Direction direction;
    public Soldier(){

        setPosition(initStartingPosition());
        setClass(AntClass.SOLDIER);
    }


}
