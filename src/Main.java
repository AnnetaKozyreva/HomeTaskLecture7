public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("White tiger", "meat", 50, "the day", 8, 78);
        Snakes snakes = new Snakes("Anaconda", "meat", 80, false, 15);
        tiger.getMove();
        tiger.getSpeed();
        tiger.animalSound();
        System.out.println("Species name is - " + tiger.getName());
        System.out.println("It Eats " + tiger.getEat());
        System.out.println("Live almost " + tiger.getAge() + " years");
        System.out.println("Sleep at " + tiger.day);
        System.out.println("Sleeps almost " + tiger.hours + " h");
        System.out.println("Average weight of the species is " + tiger.getWeight() + " kg");

        snakes.animalSound();
        snakes.reLocation();
        snakes.getMainland();
        System.out.println("Species name is - " + snakes.getName());
        System.out.println("It Eats " + snakes.getEat());
        System.out.println("Live almost " + snakes.getAge() + " years");
        System.out.println("Is it toxic? - " + snakes.toxic);
        System.out.println("Average length of the species is " + snakes.length + " m");
    }
}
