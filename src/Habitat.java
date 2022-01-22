public interface Habitat {
    default void animalSound(){
        System.out.println(" ");
    }
    abstract void reLocation();
    abstract void getMainland();
}
