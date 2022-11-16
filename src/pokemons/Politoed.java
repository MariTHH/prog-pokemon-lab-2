package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.*;

public class Politoed extends Pokemon {
    public Politoed (String name, int level){
        super (name, level);
        setStats(90,75,75,90,100,70);
        setType(Type.WATER);
        setMove(new IceBeam(), new Scald(), new WakeUpSlap(), new Rest());
    }
}