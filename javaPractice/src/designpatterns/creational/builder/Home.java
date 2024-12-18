package designpatterns.creational.builder;

public class Home {
    // Required parameters
    private final String walls;
    private final String roof;

    // Optional parameters
    private final boolean hasPool;
    private final boolean hasGarden;


    // Private constructor that only the builder can access
    private Home(HomeBuilder builder) {
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.hasPool = builder.hasPool;
        this.hasGarden = builder.hasGarden;

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

    @Override
    public String toString() {
        return "Home{" +
                "walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", hasPool=" + hasPool +
                ", hasGarden=" + hasGarden +
                '}';
    }

    // Static inner Builder class
    public static class HomeBuilder {
        // Required parameters
        private final String walls;
        private final String roof;

        // Optional parameters with default values
        private boolean hasPool = false;
        private boolean hasGarden = false;


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


        // Build method to create the Home object
        public Home build() {
            return new Home(this);
        }
    }
}
