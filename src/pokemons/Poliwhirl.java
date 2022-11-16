package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwhirl extends Pokemon {
    public Poliwhirl (String name, int level){
        super (name, level);
        setStats(65,65,65,50,50,90);
        setType(Type.WATER);
        setMove(new IceBeam(), new Scald(), new WakeUpSlap());
    }
}