import java.io.IOException;

public class Main {
    public static void main(String[] args){
/*
        Trainer tr = new Trainer();

        Pokémon po = new Pokémon("kokos", 33, "vodní");
        tr.addPokemon(po);
        Pokémon pu = new Pokémon("koks", 33, "vodní");
        tr.addPokemon(pu);
        System.out.println(tr.returnList("vodní"));
        */
        Soubory sb = new Soubory();
        try{
            sb.writeToFile("C:/java/zapad.txt.txt","C:/java/zapadOut.txt.txt");
        }catch (IOException e){
            System.out.println("bruh");
        }


    }
}