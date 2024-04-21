import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Trainer {
    private String name;
    private HashMap<String, List<Pokémon>> hm = new HashMap<>();

    public boolean TypeContains(String st){
        if(Objects.equals(st, Pokémon.Type.ohnivý.toString()) || Objects.equals(st, Pokémon.Type.travný.toString()) || Objects.equals(st, Pokémon.Type.vodní.toString()) || Objects.equals(st, Pokémon.Type.bojový.toString()) || Objects.equals(st, Pokémon.Type.bleskový.toString()) || Objects.equals(st, Pokémon.Type.psychický.toString())){
            return true;
        }else {
            return false;
        }
    }
    public void addPokemon(Pokémon p){
        hm.computeIfAbsent(p.getType(), k -> new ArrayList<>()).add(p);
    }
    public String returnList(String type){
        if(checkType(type)){
            return hm.getOrDefault(type, new ArrayList<>()).toString();
        }else{
            return null;
        }
    }
    public boolean checkType(String type){
        return TypeContains(type);
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", hm=" + hm +
                '}';
    }
}
