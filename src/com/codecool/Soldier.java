package com.codecool;

import java.util.List;

public class Soldier extends Ant {
    private static List<String> directions;
    private static int moveIterator;
    private static String nextMove;


    public Soldier(){
        initDirections();
        setPosition(initStartingPosition());
        setClass(AntClass.SOLDIER);
    }

    public String getNextMove() {
        String result = directions.get(moveIterator);
        moveIterator++;
        if (moveIterator == 5){moveIterator = 0;}
        return result;
    }

    private static void initDirections(){
        addToDir("up");
        addToDir("right");
        addToDir("down");
        addToDir("left");
    }
    private static void addToDir(String str){
        directions.add(str);
    }

}
