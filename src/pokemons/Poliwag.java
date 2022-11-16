package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwag extends Pokemon {
    public Poliwag (String name, int level){
        super (name, level);
        setStats(40,50,40,40,40,90);
        setType(Type.WATER);
        setMove(new IceBeam(), new Scald());
    }
}