package JOOP;
/*
Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
Klasa mora imati konstruktore i getere i setere.
 */
public class Planina {
    private String imePlanine;
    private String nazivDrzave;
    private double visinaPlanine;

    public Planina() {

    }

    public Planina(String imePlanine, String nazivDrzave, double visinaPlanine) {
        this.imePlanine = imePlanine;
        this.nazivDrzave = nazivDrzave;
        this.visinaPlanine = visinaPlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setVisinaPlanine(double visinaPlanine) {
        if (visinaPlanine < 0) {
            this.visinaPlanine = visinaPlanine;
        } else {
            System.out.println("Nevalidna vrednost");
        }
    }
        public double getVisinaPlanine () {
            return visinaPlanine;
        }



}
