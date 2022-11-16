package moves;

import ru.ifmo.se.pokemon.*;

public class SeedBomb extends SpecialMove {
    public SeedBomb() {
        super(Type.GRASS, 80, 100);
    }

    @Override
    protected String describe() {
        return "использует Seed Bomb";
    }
}