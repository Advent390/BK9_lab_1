package strategy;
public class MeleeAttackStrategy implements AttackStrategy {
    @Override public void attack() { System.out.println("Атака ближнього бою: удар мечем."); }
}
