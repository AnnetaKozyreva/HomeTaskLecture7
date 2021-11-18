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
    public void animalSound() {
        Habitat.super.animalSound();
    }

    @Override
    public void reLocation() {

    }

    @Override
    public void getMainland() {

    }
}
