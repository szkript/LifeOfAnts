package com.codecool;

public enum AntClass {
    QUEEN("Queen", 1, 0),
    WORKER("Worker", 4, 1),
    DRONE("Drone", 2, 1),
    SOLDIER("Soldier", 3, 1);

    private final String key;
    public final int rank;
    private final int stepLimit;

    AntClass(String key,int rank, int maxStep){
        this.key = key;
        this.rank = rank;
        this.stepLimit = maxStep;
    }

    public int getStepLimit() {
        return stepLimit;
    }

    //    public String getKey() {
//        return key;
//    }
}
