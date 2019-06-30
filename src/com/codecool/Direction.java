package com.codecool;

public enum Direction {
    UP("up"),
    RIGHT("right"),
    DOWN("down"),
    LEFT("left");

    public final String key;

    Direction(String key){
        this.key = key;
    }
}
