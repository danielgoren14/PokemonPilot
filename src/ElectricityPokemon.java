import java.util.Arrays;

public class ElectricityPokemon extends Pokemon{
    private Pokemon[] electricityPokemons;
    final private int TOTAL_ELECTRICITY_POKEMONS = 3;
    private double currentElctricity ;

    public ElectricityPokemon(String name, double maxHp, double maxAttackPoints) {
        super(name, maxHp, maxAttackPoints);
        this.electricityPokemons = new Pokemon[TOTAL_ELECTRICITY_POKEMONS];
        this.electricityPokemons[0] = new ElectricityPokemon("pikachu", 40, 30);
        this.electricityPokemons[1] = new ElectricityPokemon("blitzle",90 ,35);
        this.electricityPokemons[2] = new ElectricityPokemon("electabuzz",30,100);
    }

protected  void  addElectricty(){
        this.currentElctricity+=0.5;
}

    protected void passiveAbility(double damage) {
    damage*=this.currentElctricity;
    }


    protected void SpecialAttack() {
        int count =0;
        if (count<1){

            count++;
        }
    }

    public String toString() {
        return super.toString() + "ElectricityPokemon{" +
                "electricityPokemons=" + Arrays.toString(electricityPokemons) +
                ", TOTAL_ELECTRICITY_POKEMONS=" +
                "} ";
    }
}
