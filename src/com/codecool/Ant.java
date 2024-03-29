package com.codecool;

import java.util.Random;

public abstract class Ant {
    private int[][] position;
    public static Random rand = new Random();
    private AntClass antClass;

    //x, y coord 100 is the limit of the map
    private static final int maxRange = 100;

    public void setPosition(int[][] position) {
        this.position = position;
    }

    public int[][] getPosition() {
        return position;
    }

    public void makeStep() {
        //valid steps should be implemented here
        setPosition(calculateNextMove(this));
    }

    public int reverser(int num) {
        if (rand.nextInt(100) <= 50) {
            return -num;
        }
        return num;
    }

    public void setClass(AntClass antClass) {
        this.antClass = antClass;
    }

    public AntClass getAntClass() {
        return antClass;
    }

    public int[][] initStartingPosition() {
        int x = rand.nextInt(maxRange);
        int y = rand.nextInt(maxRange);
        int[][] startPosition = {{x, y}};
        return startPosition;
    }

    public int[][] calculateNextMove(Ant ant) {
        int x = this.getPosition()[0][0];
        int y = this.getPosition()[0][1];
        boolean notInBound = true;

        while (notInBound) {
            int chance = rand.nextInt(100);
            int addition = getAntClass().getStepLimit();
            switch (antClass) {
                case WORKER: {
                    if (chance <= 25) {
                        //right
                        y += addition;
                    } else if (chance <= 50) {
                        //up
                        x += addition;
                    } else if (chance <= 75) {
                        //left
                        y -= addition;
                    } else if (chance <= 100) {
                        //down
                        x -= addition;
                    }
                    break;
                }
                case DRONE: {
                    int pointOfInterest = 50;
                    if (x > pointOfInterest) {
                        x -= addition;
                    } else if (x < pointOfInterest) {
                        x += addition;
                    } else if (y > pointOfInterest) {
                        y -= addition;
                    } else if (y < pointOfInterest) {
                        y += addition;
                    }
                    break;
                }
                case QUEEN: {
                    //doesnt give a fck or is she?huehue
                    break;
                }
                case SOLDIER: {
                    Direction direction = ((Soldier) ant).getDirection();
                    System.out.println(direction);
                    switch (direction) {
                        case UP:
                            x += addition;
                            break;
                        case RIGHT:
                            y -= addition;
                            break;
                        case DOWN:
                            x -= addition;
                            break;
                        case LEFT:
                            y += addition;
                            break;
                    }
                    ((Soldier) ant).nextDirection();
                    break;
                }
            }
            if (inBounds(x) && inBounds(y)) {
                notInBound = false;
            }
        }
        int[][] newPos = {{x, y}};
        return newPos;
    }

    private boolean inBounds(int newCoord) {
        return newCoord >= 0 && newCoord < 100;
    }

}
