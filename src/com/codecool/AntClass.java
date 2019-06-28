package com.codecool;

public enum AntClass {
    QUEEN("Queen", 1),
    WORKER("Worker", 4),
    DRONE("Drone", 2),
    SOLDIER("Soldier", 3);

    private final String key;
    public final int rank;

    AntClass(String key,int rank){
        this.key = key;
        this.rank = rank;
    }

//    public String getKey() {
//        return key;
//    }
}
