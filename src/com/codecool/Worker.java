package com.codecool;

public class Worker extends Ant {

    public Worker(){
        makeStep(initStartingPosition());
        setClass(AntClass.WORKER);
    }


}
