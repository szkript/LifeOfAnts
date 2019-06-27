package com.codecool;

public enum AntClass {
    WORKER("Worker"),
    DRONE("Drone"),
    QUEEN("Queen"),
    SOLDIER("Soldier");

    private final String key;

    AntClass(String key){
        this.key = key;
    }

//    public String getKey() {
//        return key;
//    }
}
