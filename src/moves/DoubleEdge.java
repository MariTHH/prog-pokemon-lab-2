package moves;
import ru.ifmo.se.pokemon.*;

public class DoubleEdge extends PhysicalMove {
    public DoubleEdge()
    {
        super(Type.NORMAL,120,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.HP, (int) -(DoubleEdge.this.power/3));
        super.applyOppEffects(p);
    }
    @Override
    protected String describe() {
        return "применяет DoubleEdge";
    }
}