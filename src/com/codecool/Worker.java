package com.codecool;

public class Worker extends Ant {

    public Worker(){
        makeStep(initStartingPosition());
        setClass(AntClass.WORKER);
    }
    private int[][] initStartingPosition(){
        int x = reverser(rand.nextInt(50));
        int y = reverser(rand.nextInt(50));
        int[][] nextPosition = {{x,y}};
        return nextPosition;
    }

}
