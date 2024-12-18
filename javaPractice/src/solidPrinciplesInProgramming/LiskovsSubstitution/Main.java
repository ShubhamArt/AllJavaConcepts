package solidPrinciplesInProgramming.LiskovsSubstitution;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.fly();

        Bird penguin = new Penguin();
        // Uncommenting this line will throw an exception:
        // penguin.fly();
        ((Penguin) penguin).swim();
    }
}
