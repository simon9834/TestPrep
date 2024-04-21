import java.util.HashSet;
import java.util.Objects;

public class User implements Comparable<User>{
    private String name;
    private String ID;
    private String password;
    private HashSet<User> hs = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(ID, user.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", password='" + password + '\'' +
                ", hs=" + hs +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if(ID.matches("/^\\d+-{1}+[a-zA-Z]+$/gm")){
            this.ID = ID;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int compareTo(User o) {
        return this.getID().compareTo(o.getID());
    }
}
