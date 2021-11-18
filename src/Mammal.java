public class Mammal extends NewAnimal {
    int weight;

    public Mammal(String speciesName, String food, int years, int animalWeight) {
        super(speciesName, food, years);
        weight = animalWeight;
    }

    @Override
    public void voice() {
        System.out.println("Ar-r-r-r");
    }

    public int getWeight() {
        return weight;
    }
}
