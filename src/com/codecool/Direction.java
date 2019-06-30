package com.codecool;

public enum Direction {
    LEFT("left"),
    RIGHT("right"),
    UP("up"),
    DOWN("down");


    private final String key;

    Direction(String key){
        this.key = key;
    }
}
