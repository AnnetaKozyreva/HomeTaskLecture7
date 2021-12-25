public class Snakes extends Reptile implements Habitat {
    boolean toxic;
    int length;

    public Snakes(String speciesName, String food, int years, boolean poison, int snakeLength) {
        super(speciesName, food, years);
        toxic = poison;
        length = snakeLength;
    }

    @Override
    public void voice() {
        System.out.println("ssssssss");
    }

    @Override
    public void reLocation() {
        System.out.println("Snakes are mainly terrestrial, but some species live underground, in water, in trees." );
    }

    @Override
    public void getMainland() {
        System.out.println("Snakes have mastered almost all the living spaces of the Earth, except for the air.\nThey are found on all continents except Antarctica." );
    }
}
