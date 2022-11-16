package moves;

import ru.ifmo.se.pokemon.*;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.POISON, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.3)
            Effect.poison(p);
    }

    @Override
    protected String describe() {
        return "Применяет атаку Sludge Bomb";
    }
}