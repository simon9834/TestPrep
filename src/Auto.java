import java.io.Serializable;

public class Auto implements Serializable {
    private String značka;
    private String model;

    public Auto(String značka, String model) {
        this.značka = značka;
        this.model = model;
    }

    public String getZnačka() {
        return značka;
    }

    public void setZnačka(String značka) {
        this.značka = značka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
