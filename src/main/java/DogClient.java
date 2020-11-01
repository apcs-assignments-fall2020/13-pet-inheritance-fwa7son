public class DogClient {
    public static void main(String[] args) {
        Dog duffy = new Dog("Duffy", 3, "golden doodle");
        System.out.println(duffy);
        duffy.makeNoise();        
    }
}