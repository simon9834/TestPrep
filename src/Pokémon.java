import java.lang.reflect.Type;
import java.util.Objects;

public class Pokémon {
    private String name;
    private int lvl;
    private String type;
    public enum Type{
        travný, ohnivý, vodní, bojový, bleskový, psychický;
    }
    public boolean TypeContains(String st){
        if(Objects.equals(st, Type.ohnivý.toString()) || Objects.equals(st, Type.travný.toString()) || Objects.equals(st, Type.vodní.toString()) || Objects.equals(st, Type.bojový.toString()) || Objects.equals(st, Type.bleskový.toString()) || Objects.equals(st, Type.psychický.toString())){
            return true;
        }else {
            return false;
        }
    }
    public Pokémon(String name, int lvl, String type) {
        this.name = name;
        this.lvl = lvl;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Pokémon{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", type='" + type + '\'' +
                '}';
    }

    public void setType(String type) {
        if(TypeContains(type)) {
            this.type = type;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
