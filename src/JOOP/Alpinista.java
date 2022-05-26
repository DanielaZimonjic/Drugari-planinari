package JOOP;
/*
Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost)
i poeni se mogu menjati kroz adekvatnu metodu.
Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500
 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
Alpinista, id: id
ime: ime i prezime
Broj poena: poeni
 */
public class Alpinista extends Planinar {
    private int poeni;


    public Alpinista(){

    }
    public Alpinista(String ime,String prezime,int id,int poeni,){
     super(ime,prezime,id);
     this.poeni=poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

    public int getPoeni() {
        return poeni;
    }


    public void stampaj() {

    }

    @Override
    public int vratiClanarinu() {
        return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
            return planina.getVisinaPlanine() <= 4000;
        }

    }



