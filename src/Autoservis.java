import java.io.*;
import java.util.ArrayList;

public class Autoservis{
    private String name;
    private ArrayList<Auto> ar = new ArrayList<Auto>();
    public void arAdd(String značka, String model){
        ar.add(new Auto(značka, model));
    }
    public void objToFile(String filePath){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(ar.get(0));
            System.out.println("Auto serializováno");
            ar.remove(0);
        }catch(IOException e){
            System.out.println("Error1");
        }
    }
    public boolean checkAr(){
        return !ar.isEmpty();
    }

    public void fileToObj(String filePath){
        try{
        ObjectInputStream oos = new ObjectInputStream(new FileInputStream(filePath));
        ar.add((Auto) oos.readObject());
            System.out.println("Auto deserializováno");
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Error2");
        }
    }
}
