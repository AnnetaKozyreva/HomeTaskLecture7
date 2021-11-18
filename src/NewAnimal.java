public abstract class NewAnimal {
    public String name;
    public String eat;
    public int age;
    public NewAnimal (String speciesName,String food,int years) {
        name = speciesName;
        eat = food;
        age = years;
    }
    public abstract void voice();
    public void makeNoise() {
        System.out.println("Animals make noise");
    }

    public String getName(){
        return name;
    }

    public String getEat(){
        return eat;
    }

    public int getAge(){
        return age;
    }
}