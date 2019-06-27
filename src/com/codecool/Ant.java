package com.codecool;

import java.util.Random;

public abstract class Ant {
    private int[][] position;
    public static Random rand = new Random();
    private static int[][] step;
    private AntClass antClass;

    //x, y coord 100 is the limit of the map
    private static final int maxRange = 100;

    private void setPosition(int[][] position) {
        this.position = position;
    }

    public int[][] getPosition() {
        return position;
    }

    public void makeStep(int[][] nextCoordinate){
        setPosition(nextCoordinate);
    }

    public int reverser(int num){
        if (rand.nextInt(100) <= 50){
            return -num;
        }
        return num;
    }

    public void setClass(AntClass antClass) {
        this.antClass = antClass;
    }

}
