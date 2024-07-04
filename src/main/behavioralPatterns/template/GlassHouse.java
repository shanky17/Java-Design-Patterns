package main.behavioralPatterns.template;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building glass walls");
    }

    @Override
    public void buildRoof() {
        System.out.println("Building glass roof");
    }
}
