package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Kartana extends Pokemon {
    public Kartana(String name, int level) {
        super(name, level);
        setStats(59, 181, 131, 59, 31, 109);
        setType(Type.GRASS, Type.STEEL);
        setMove(new Rest(), new DoubleEdge(), new FireBlast(), new EnergyBall());
    }
}