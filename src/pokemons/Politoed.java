package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Politoed extends Poliwhirl {
    public Politoed(String name, int level) {
        super(name, level);
        setStats(90, 75, 75, 90, 100, 70);
        setType(Type.WATER);
        setMove(new Rest());
    }
}