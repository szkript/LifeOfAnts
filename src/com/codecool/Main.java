package com.codecool;

public class Main {
    private static int lifeCycle = 5;
    private static int day = 0;

    public static void main(String[] args){

        AntLife antLife = new AntLife();
        while (!doomsday()){
            dailyReportMessage();
            antLife.timeStep();
        }
        System.out.println("days were liven: "+day);

    }

    private static boolean doomsday(){
        lifeCycle--;
        day++;
        return lifeCycle == 0;
    }

    private static void dailyReportMessage(){
        System.out.println("daily report: day "+ day);
    }
}
