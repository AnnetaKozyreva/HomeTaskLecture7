public class Reptile extends NewAnimal {
    public Reptile(String speciesName, String food, int years) {
        super(speciesName, food, years);
    }

    @Override
    public void voice() {
        System.out.println("Sh-sh-sh");
    }
}
