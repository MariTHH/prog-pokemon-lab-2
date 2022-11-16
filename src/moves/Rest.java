package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setCondition(new Effect().condition(Status.SLEEP).turns(2));
        p.restore();
    }

    @Override
    protected String describe() {
        return "использует Rest";
    }
}