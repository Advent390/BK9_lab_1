package factory;
/*
 * FACTORY: фабрика централізує створення персонажів.
 * Доцільність: клієнтський код не залежить від конкретних класів
 * Warrior, Mage та Archer і легко підтримує нові типи.
 */
public class CharacterFactory {
    public static Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "warrior": return new Warrior();
            case "mage": return new Mage();
            case "archer": return new Archer();
            default: throw new IllegalArgumentException("Невідомий тип персонажа: " + type);
        }
    }
}
