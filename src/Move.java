public interface Move {
    default void animalSound(){
        System.out.println(" ");
    }

    abstract void getMove();
    abstract void getSpeed();
}
