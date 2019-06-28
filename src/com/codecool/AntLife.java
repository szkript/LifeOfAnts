package com.codecool;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AntLife {
    private List<Ant> ants = new ArrayList<>();
    private static int[][] grid = new int[100][100];

    public AntLife(){
        init(ants);
        assignToGrid(ants);
    }

    private static void init(List<Ant> ants){
        ants.add(new Queen());

        for (int i = 0; i < 5 ; i++){
            ants.add(new Worker());
            ants.add(new Drone());
            ants.add(new Soldier());
        }

    }

    /**
     * ant rank assigned to grid coordinate
     * @param ants
     */
    private void assignToGrid(List<Ant> ants){
        for (Ant ant : ants){
            grid[ant.getPosition()[0][0]][ant.getPosition()[0][1]] = ant.getAntClass().rank;
        }

    }

    public void timeStep(){
        for (Ant ant : this.ants){
            ant.makeStep();
        }

    }
}
