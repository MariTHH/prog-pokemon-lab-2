package moves;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect e0=new Effect().turns(0).stat(Stat.HP,-99999);
        Effect e1=new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(e0);
        p.setCondition(e1);
    }
    @Override
    protected String describe(){
        return "использует Rest";
    }
}