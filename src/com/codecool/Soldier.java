package com.codecool;


import java.util.ArrayList;
import java.util.List;

public class Soldier extends Ant {

    private static List<Direction> directions = new ArrayList<>();
    private Direction direction;

    public Soldier(){
        setPosition(initStartingPosition());
        setClass(AntClass.SOLDIER);
        initDirections();
        this.direction = directions.get(0);
    }

    private void initDirections(){
        directions.add(Direction.UP);
        directions.add(Direction.RIGHT);
        directions.add(Direction.DOWN);
        directions.add(Direction.LEFT);
    }
    public Direction getDirection(){
        return direction;
    }
    public void nextDirection(){
        Direction actualDirection = getDirection();
        if (actualDirection == Direction.LEFT){
            this.direction = directions.get(0);
        }
        this.direction = directions.get(directions.indexOf(actualDirection)+1);
    }

}
