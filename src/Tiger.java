public class Tiger extends Mammal implements Move {
    String day;
    int hours;

    public Tiger(String speciesName, String food, int years, String dayNight, int sleepHours, int animalWeight) {
        super(speciesName, food, years, animalWeight);
        day = dayNight;
        hours = sleepHours;

    }

    @Override
    public void voice() {
        System.out.println("Ar-r-r-r!");
    }

    public void sleep(String day) {
        System.out.println("Animal sleeps at " + day);
    }

    public void sleep(int hours) {
        System.out.println("Animal sleeps almost " + hours);
    }

    @Override
    public void animalSound() {
        System.out.println("Tiger says <Ar-r-r-r>");
    }

    @Override
    public void getSpeed() {
        System.out.println("Tiger`s speed is " + speed + " miles/h. " );
    }

    @Override
    public void getMove() {
        System.out.println("Usually Tigers move in " + move);
    }
}
