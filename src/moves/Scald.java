package moves;
import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80.00, 100.00);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.30).turns(1).condition(Status.BURN);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Scald";
    }
}
