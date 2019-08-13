package com.codecool.ants;

import java.util.ArrayList;
import java.util.List;

public class AntBoi {
    private List<Ant> ants = new ArrayList<>();
    private int gridMaxRange;
    private Queen queen;

    public AntBoi(int gridMaxRange) {
        this.gridMaxRange = gridMaxRange;
    }

    public void summonAnt(Ant ant){
        ants.add(ant);
    }
}
