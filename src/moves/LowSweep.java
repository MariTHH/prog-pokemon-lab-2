package moves;
import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove{
    public LowSweep(){
        super(Type.FIGHTING, 65.00d, 100.00d);
        describe();
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    @Override
    protected String describe() {
        return "применяет LowSweep";
    }
}
