package com.codecool;

public class Worker extends Ant {

    public Worker(){
        makeStep(initStartingPosition());
        setClass(AntClass.WORKER);
    }
    private int[][] initStartingPosition(){
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);
        int[][] nextPosition = {{x,y}};
        return nextPosition;
    }

}
