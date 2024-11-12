package designpatterns.creational.builder;

public class Home {
    // Required parameters
    private final String walls;
    private final String roof;

    // Optional parameters
    private final boolean hasPool;
    private final boolean hasGarden;
    private final boolean hasGarage;
    private final int numberOfFloors;

    // Private constructor that only the builder can access
    private Home(HomeBuilder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.hasPool = builder.hasPool;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;
        this.numberOfFloors = builder.numberOfFloors;
    }

    // Getters for the fields
    public String getWalls() {
        return walls;
    }

    public String getRoof() {
        return roof;
    }

    public boolean hasPool() {
        return hasPool;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    @Override
    public String toString() {
        return "Home [walls=" + walls + ", roof=" + roof +
                ", pool=" + hasPool + ", garden=" + hasGarden +
                ", garage=" + hasGarage + ", floors=" + numberOfFloors + "]";
    }

    // Static inner Builder class
    public static class HomeBuilder {
        // Required parameters
        private final String walls;
        private final String roof;

        // Optional parameters with default values
        private boolean hasPool = false;
        private boolean hasGarden = false;
        private boolean hasGarage = false;
        private int numberOfFloors = 1; // Default is 1 floor

        // Constructor for required parameters
        public HomeBuilder(String walls, String roof) {
            this.walls = walls;
            this.roof = roof;
        }

        // Builder methods for optional parameters
        public HomeBuilder setPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HomeBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HomeBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HomeBuilder setNumberOfFloors(int numberOfFloors) {
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        // Build method to create the Home object
        public Home build() {
            return new Home(this);
        }
    }
}
