package com.codecool;

public class Queen extends Ant {
    //x, y coordinate
    private static final int[][] pos = {{0,0}};

    public Queen(){
        makeStep(pos);
        setClass(AntClass.QUEEN);
    }
}
