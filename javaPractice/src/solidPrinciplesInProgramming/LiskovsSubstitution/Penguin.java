package solidPrinciplesInProgramming.LiskovsSubstitution;

public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly.");
    }

    public void swim() {
        System.out.println("Penguin is swimming.");
    }
}
