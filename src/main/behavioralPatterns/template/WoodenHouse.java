package main.behavioralPatterns.template;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Building wooden roof");
    }
}
