package designpatterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        // Build a home with all optional features
        Home luxuryHome = new Home.HomeBuilder("Brick Walls", "Tile Roof")
                .setPool(true)
                .setGarden(true)
                .setGarage(true)
                .setNumberOfFloors(3)
                .build();

        System.out.println(luxuryHome);

        // Build a simpler home with only the required features
        Home simpleHome = new Home.HomeBuilder("Wooden Walls", "Shingle Roof")
                .build();

        System.out.println(simpleHome);

        // Build a home with some optional features
        Home familyHome = new Home.HomeBuilder("Concrete Walls", "Metal Roof")
                .setGarden(true)
                .setNumberOfFloors(2)
                .build();

        System.out.println(familyHome);
    }
}
