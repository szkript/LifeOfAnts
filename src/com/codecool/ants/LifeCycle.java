package com.codecool.ants;


public class LifeCycle {
    private static int DAYS_TO_LIVE = 100;
    private static int NUMBER_OF_WORKER = 0;
    private static int NUMBER_OF_DRONE = 0;
    private static int NUMBER_OF_SOLDIER = 0;
    private static int NUMBER_OF_QUEEN = 0;
    private static int MAXIMUM_GRID_RANGE = 100;

    public static void main(String[] args) {
        AntBoi colony = new AntBoi(MAXIMUM_GRID_RANGE);
        for (int day = 0; day <= DAYS_TO_LIVE; day++)
            System.out.println(Util.myRandom.nextInt(5));
    }

}

