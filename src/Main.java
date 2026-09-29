import factory.Character;
import factory.CharacterFactory;
import observer.AchievementNotification;
import observer.Game;
import observer.PlayerNotification;
import strategy.AttackCalculator;
import strategy.MagicAttackStrategy;
import strategy.MeleeAttackStrategy;
import strategy.RangedAttackStrategy;

public class Main {
    public static void main(String[] args) {
        /*
         * Тема: «Система керування відеогрою».
         * Factory — створення персонажів.
         * Strategy — вибір способу атаки.
         * Observer — повідомлення про ігрові події.
         */

        System.out.println("========== FACTORY ==========");
        Character warrior = CharacterFactory.createCharacter("warrior");
        Character mage = CharacterFactory.createCharacter("mage");
        Character archer = CharacterFactory.createCharacter("archer");
        warrior.attack();
        mage.attack();
        archer.attack();

        System.out.println("\n========== STRATEGY ==========");
        AttackCalculator calculator = new AttackCalculator(new MeleeAttackStrategy());
        calculator.attack();
        calculator.setStrategy(new RangedAttackStrategy());
        calculator.attack();
        calculator.setStrategy(new MagicAttackStrategy());
        calculator.attack();

        System.out.println("\n========== OBSERVER ==========");
        Game game = new Game();
        PlayerNotification player = new PlayerNotification();
        AchievementNotification achievement = new AchievementNotification();
        game.addObserver(player);
        game.addObserver(achievement);
        game.notifyObservers("BOSS_DEFEATED");
        game.removeObserver(achievement);
        game.notifyObservers("LEVEL_COMPLETED");
    }
}
