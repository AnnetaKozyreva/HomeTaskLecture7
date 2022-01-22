public interface Move {
  public static final String move = "large strides";
  public static final int speed = 80;

    default void animalSound(){
        System.out.println(" ");
    }

    abstract void getMove();
    abstract void getSpeed();
}
