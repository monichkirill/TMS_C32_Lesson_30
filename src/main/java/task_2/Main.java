package task_2;

import task_2.factory.CharacterFactory;
import task_2.factory.LocationFactory;
import task_2.model.character.Character;
import task_2.model.location.Location;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose your character: archer, warrior, wizard.");
            String character = sc.next();
            System.out.println("Choose your location: city, forest, desert.");
            String location = sc.next();
            try {
                Character yourCharacter = CharacterFactory.createCharacter(character);
                Location yourLocation = LocationFactory.createLocation(location);
                System.out.println(yourCharacter.characterName() + yourLocation.locationName());
            }catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
