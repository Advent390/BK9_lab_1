package strategy;
/*
 * STRATEGY: дозволяє замінювати алгоритм атаки під час виконання.
 * Доцільність: немає великого блоку if/else для різних атак.
 */
public class AttackCalculator {
    private AttackStrategy strategy;
    public AttackCalculator(AttackStrategy strategy) { this.strategy = strategy; }
    public void setStrategy(AttackStrategy strategy) { this.strategy = strategy; }
    public void attack() { strategy.attack(); }
}
