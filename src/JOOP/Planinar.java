package JOOP;
//Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
/*
 Pored toga, klasa ima:
apstraktnu metodu štampaj
apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
 */
public abstract class Planinar {
    private int id;
    private String ime;
    private String prezime;

    public Planinar(){

    }
    public Planinar(String ime,String prezime,int id){
        this.id=id;
        this.ime=ime;
        this.prezime=prezime;

    }


    public String getPrezime() {
        return prezime;
    }


    public String getIme() {
        return ime;
    }


    public int getId() {
        return id;
    }


     public  abstract void stampaj();



     public  abstract int vratiClanarinu();

    public abstract boolean uspesanUspon(Planina planina);



}
