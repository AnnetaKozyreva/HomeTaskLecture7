public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("White tiger", "meat", 50, "day", 8, 78);
        Snakes snakes = new Snakes("Anaconda", "meat", 80, false, 15);
        tiger.getMove();
        tiger.getSpeed();
        tiger.animalSound();
        System.out.println("Name " + tiger.getName());
        System.out.println("Eats " + tiger.getEat());
        System.out.println("Live almost " + tiger.getAge());
        System.out.println("Sleep at " + tiger.day);
        System.out.println("Sleeps almost " + tiger.hours + " h");
        System.out.println("Weight is " + tiger.getWeight());

        snakes.animalSound();
        snakes.reLocation();
        snakes.getMainland();
        System.out.println("Name " + snakes.getName());
        System.out.println("Eats " + snakes.getEat());
        System.out.println("Live almost " + snakes.getAge());
        System.out.println("Is it toxic? - " + snakes.toxic);
        System.out.println("Length " + snakes.length + " m");
    }
}
