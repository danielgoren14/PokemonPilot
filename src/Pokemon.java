public abstract class Pokemon {
    private String name;
    final private double MAX_HP;
    private double currentHP;
    private double maxAttackPoints;
    private final double THREE_QUARTERS_ATTACKS_POINTS = 0.75 *  this.maxAttackPoints;

    public Pokemon(String name, double maxHp, double maxAttackPoints) {
        this.name = name;
        this.MAX_HP = maxHp;
        this.currentHP=maxHp;
        this.maxAttackPoints = startAttackPoints(maxAttackPoints);
    }
    private double startAttackPoints(double attackPoints){
        attackPoints=attackPoints* THREE_QUARTERS_ATTACKS_POINTS;
        return attackPoints;
    }
    protected void kickAttack(Pokemon attackPokemon , Pokemon defensePokemon){
        final int kickAttackDemage=2;
        System.out.println(attackPokemon + "is kicking "+defensePokemon );
        defensePokemon.currentHP-=kickAttackDemage;
    }
    protected abstract void SpecialAttack();
    protected abstract void passiveAbility();

    public double getMaxHp() {
        return MAX_HP;
    }

    public double getCurrentHP() {
        return currentHP;
    }

    public double getMaxAttackPoints() {
        return maxAttackPoints;
    }

    public String getName() {
        return name;
    }

    public void changeCurrentHP(double addHp) {
        if ((currentHP+addHp)< MAX_HP){
        this.currentHP += addHp;
        }
    }

    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", hp=" + MAX_HP +
                ", attackPoints=" + maxAttackPoints +
                '}';
    }
}
