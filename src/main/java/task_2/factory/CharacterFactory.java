package task_2.factory;

import task_2.model.character.Character;
import task_2.model.character.impl.Archer;
import task_2.model.character.impl.Warrior;
import task_2.model.character.impl.Wizard;

public class CharacterFactory {
    public static Character createCharacter(String type) {
        return switch (type.toLowerCase()) {
            case "mage" -> new Wizard();
            case "warrior" -> new Warrior();
            case "archer" -> new Archer();
            default -> throw new IllegalArgumentException("Invalid character type: " + type);
        };
    }
}
