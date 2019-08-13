package com.codecool.ants;

import java.util.Random;

public class Util {

    public static final Random myRandom = new Random();

    public int[][] randomStartingPosition(int maximumRange){
        int x = myRandom.nextInt(maximumRange);
        int y = myRandom.nextInt(maximumRange);
        int[][] position = new int[x][y];
        return position;
    }
}
