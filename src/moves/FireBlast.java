package moves;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 85, 110);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).condition(Status.BURN));
    }

    @Override
    protected String describe() {
        return "Применяет Fire Blast";
    }
}