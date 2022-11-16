package moves;
import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {
    public WakeUpSlap (){
        super(Type.FIGHTING, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        Status PCon = p.getCondition();
        if (PCon.equals(Status.SLEEP)) {
            p.setMod(Stat.HP, (int) Math.round(damage) * 2);
            p.setCondition(new Effect());
        }
        else p.setMod(Stat.HP, (int) Math.round(damage));
    }
    @Override
    protected String describe() {
        return "исользует WakeUpSlap";
    }
}