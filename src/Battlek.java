import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Battlek {

    public static void main(String[] args) {
        Battle fight = new Battle();
        fight.addAlly(new Kartana("White", 1));
        fight.addAlly(new Shroomish("Beige", 2));
        fight.addAlly(new Breloom("Red", 3));
        fight.addFoe(new Poliwag("Blue", 2));
        fight.addFoe(new Poliwhirl("BlueX2", 3));
        fight.addFoe(new Politoed("Green", 4));
        fight.go();
    }
}