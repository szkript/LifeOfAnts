package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class AntLife {
    private List<Ant> ants = new ArrayList<Ant>();

    public static void main(String[] args) {


        Ant queen = new Queen();
        Ant worker = new Worker();

    }
}

//
//    Life of the Ant
//    In an Ant colony there are four different castes:
//    Workers, Soldiers, Drones, and there is one Queen.
//
//        For the sake of simplicity let they live on a grid.
//        Ant have an actual ( x , y ) position (initialize these within the limits of the colony,
//        e.g. 100 steps). They change their positions in each timestep, according to a caste-specific rule:
//        The Queen sits in the origo and does not move.
//        All the Ant are aware of their distance from the Queen which is the number of steps needed to get to her
//        (write a function for it!).
//        The Workers normally make one step randomly in one of the four directions.
//        The Soldiers normally just “patrol” close to their starting points;
//        this means that in a 4-cycle they step one towards North, then East, South, and West,
//        and then they start the cycle again.
//        The Drones always try to make one step towards the Queen.
//        When they get 3 steps close, they have a chance that the Queen is in the mood of mating.
//        In this happy case they say “HALLELUJAH”, stay there for 10 timesteps,
//        and after that they are kicked off to a random point with the distance of 100 steps.
//        If they do not have luck, they say “D’OH”, and are kicked 100 steps away instantly.
//        The Queen’s mating mood is following this rule: after a successful mating she sets a countdown timer
//        (starting from some time between 100 and 200 timesteps) to get in the mood again.
//        Tip: at first you can skip this part and set the Queen’s mood randomly.
//        Extra feature: Sometimes a Wasp appears in the colony.
//        In this case all movements freeze in the colony except that the Soldiers start to move towards the Wasp.
//        The first Soldier to get there says “HAJIME” and kills the intruder. All the ants continue with their normal activities.
//        Hints : you should have an abstract class, use inheritance, data hiding and make sure there is no code repetition.