package com.codecool;

public class Queen extends Ant {
    //x, y coordinate
    private static final int[][] pos = {{50,50}};

    public Queen(){
        setPosition(pos);
        setClass(AntClass.QUEEN);
    }

}
