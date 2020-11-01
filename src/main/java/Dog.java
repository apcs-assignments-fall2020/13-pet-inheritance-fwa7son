public class Dog extends Pet {
    // Instance variable(s)
    private String breed;

    // Constructors
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed = breed;
    }

    public Dog(){
        super("Duffy",4);
        this.breed = "Golden Doodle";
    }
    // makeNoise() method
    public void makeNoise(){
        System.out.println("woof");
    }

    // toString method
    public String toString() {
        String str = "Name:" + this.getName() + " Age:" + this.getAge() + " Breed:" + this.breed;
        return str;
    }

    // Getter
    public String getBreed(){
        return this.breed;
    }

    // Setter
    public void setBreed(String breed){
        if (breed.trim().length() != 0) {
        this.breed = breed;
        }
    }
}