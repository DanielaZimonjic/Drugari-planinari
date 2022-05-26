package JOOP;
/*
Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
naziv okruga odakle je rekreativni planinar
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
Rekreativac, id: id
ime: ime prezime Okrug: okrug

 */
public class RekreativniPlaninar extends Planinar {
    private int tezinaOpreme;
    private String nazivOkruga;
    private int maksimalniUspon;
    private static final int clanarina=1000;


    public RekreativniPlaninar(){

    }
    public  RekreativniPlaninar(String ime, String prezime,int id,int tezinaOpreme,String nazivOkruga,int maksimalniUspon){
        super(ime,prezime,id);
        this.tezinaOpreme=tezinaOpreme;
        this.nazivOkruga=nazivOkruga;
        this.maksimalniUspon=maksimalniUspon;


    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setMaksimalniUspon(int maksimalniUspon) {
        this.maksimalniUspon = maksimalniUspon;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public int getMaksimalniUspon() {
        return maksimalniUspon;
    }


    @Override
    public  void stampaj(){
        System.out.println("Rekreativac id "+ getId());
        System.out.println("Ime: "+ getIme()+" "+getPrezime()+ " Okrug: "+getNazivOkruga());
    }

    @Override
   public int vratiClanarinu() {
         return clanarina;

    }

    @Override
   public boolean uspesanUspon(Planina planina) {
        return
    }

}
