package dnd_character_generator;

public class App {

    public static void main(String[] args) {
        // instantiate an instance of the random race generator class
        DnDRace randomRace = new DnDRace();

        // call the instances get
        String newRace = randomRace.getRandomRace();

        System.out.println(newRace);
    }
}
