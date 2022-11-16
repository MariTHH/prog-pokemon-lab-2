import pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Battlek {

    public static void main(String[] args) {
        Battle f = new Battle();
        f.addAlly(new Kartana("White", 1));
        f.addAlly(new Shroomish("Beige", 1));
        f.addAlly(new Breloom("Red", 1));
        f.addFoe(new Poliwag("Blue", 1));
        f.addFoe(new Poliwhirl("BlueX2", 1));
        f.addFoe(new Politoed("Green", 1));
        f.go();
    }
}