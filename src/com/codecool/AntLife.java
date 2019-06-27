package com.codecool;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AntLife {
    private List<Ant> ants = new ArrayList<>();
    private static int[][] grid = new int[100][100];

    public static void main(String[] args) {
        init();
    }

    public void addAnt(Ant ant){
        ants.add(ant);
    }

    private static void init(){
        new Queen();


        for (int i = 0; i < 20 ; i++){

        }
        Ant worker = new Worker();
        Ant drone = new Drone();
        Ant soldier = new Soldier();
    }
}
