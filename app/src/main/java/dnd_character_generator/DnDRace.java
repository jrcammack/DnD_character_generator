package dnd_character_generator;

import java.util.Random;

public class DnDRace {
    public enum Races { 
        Dragonborn, Dwarf, Elf, Gnome, Half_Elf, Half_Orc, Halfling, Human, Tiefling, Aarakocra,
        Aasimar, Changeling, Deep_Gnome, Duergar, Eladrin, Fairy, Firbolg, Genasi_Air, Genasi_Earth, Genasi_Fire, 
        Genasi_Water, Githyanki, Githzerai, Goliath, Harengon, Kenku, Locathah, Owlin, Satyr, Sea_Elf, Shadar_Kai,
        Tabaxi, Tortle, Triton, Verdan, Bugbear, Centaur, Goblin, Grung, Hobgoblin, Kobold, Lizardfolk, Minotaur,
        Orc, Shifter, Yuan_Ti, Dragonlance, Eberron, Plane_Shift, Ravenloft, Ravnica, Spelljammer, Theros 
    }

    public final int NUM_RACES = Races.values().length;

    public String getRandomRace() {
        // get enum values into an array
        Races[] races = Races.values();

        // create an instance of the Random class
        Random randNumGenerator = new Random();

        // use the created instance to generate a random number. random num generated is 0 inclusive and exclusive of the passed parameter so by passing the length we ensure all possible values are valid indices
        int randNum = randNumGenerator.nextInt(NUM_RACES);

        // return the value in the array at the given index
        return races[randNum].toString();      
    }
    
        
}
