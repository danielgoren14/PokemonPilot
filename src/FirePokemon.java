import java.util.Arrays;
import java.util.Random;

public class FirePokemon extends Pokemon{
    private  Pokemon[] firePokemons;
    final private int TOTAL_FIRE_POKEMONS = 3;
    final private int NUMBER_TO_LOSE_ABILITY = 0;// doesn't matter, can be also 1,2,3 but only one of them
    final private int MAX_RANDOMAL_NUMBER = 4;
    final private int MIN_RANDOMAL_NUMBER = 0;
    public FirePokemon(String name, double hp, int attackPoints) {
        super(name, hp, attackPoints);
        this.firePokemons = new Pokemon[TOTAL_FIRE_POKEMONS];
        this.firePokemons[0] = new FirePokemon("charmander",80,40);
        this.firePokemons[1] = new FirePokemon("salandit",100,60);
        this.firePokemons[2] = new FirePokemon("moltres",120,60);
    }
    @Override
    protected void passiveAbility() {
        Random random = new Random();
        int randomNumber = random.nextInt();
        if(randomNumber == NUMBER_TO_LOSE_ABILITY){
            int pointsToLose = -1 * random.nextInt(3,11);
            changeCurrentHP(pointsToLose);
        }
    }

    protected void SpecialAttack() {
        int count =0;
        if (count<1){
            count++;
        }
    }

    public String toString() {
        return super.toString() + "FirePokemon{" +
                "firePokemons=" + Arrays.toString(firePokemons) +
                ", TOTAL_FIRE_POKEMONS=" +
                "} " ;
    }
}
