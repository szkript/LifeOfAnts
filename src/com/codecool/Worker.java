package com.codecool;

public class Worker extends Ant {

    public Worker(){
        setPosition(initStartingPosition());
        setClass(AntClass.WORKER);
    }
    @Override
    public void makeStep(){
        this.setPosition(initStartingPosition());
    }

}
