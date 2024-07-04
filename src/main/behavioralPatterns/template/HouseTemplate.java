package main.behavioralPatterns.template;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
        buildWindows();

        System.out.println("House is built");
    }

    public abstract void buildWalls();

    public abstract void buildRoof();

    private void buildWindows() {
        System.out.println("Building glass windows");
    }

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron and sand");
    }
}
