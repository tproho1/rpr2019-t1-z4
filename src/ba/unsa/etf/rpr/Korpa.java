package ba.unsa.etf.rpr;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Korpa {
    private List<Artikl> artikli;

    Korpa(){
        artikli = new ArrayList<>();
    }

    public boolean dodajArtikl(Artikl artikl){
        return artikli.add(artikl);
    }

    public Artikl[] getArtikli() {
        Artikl[] nizArtikala = new Artikl[50];
        int i = 0;

        for(Artikl a : artikli){
            nizArtikala[i] = a;
            i++;
        }
        return nizArtikala;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(Artikl a : artikli){
            if(a.getKod().equals(kod)){
                artikli.remove(a);
                return a;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int ukupnaCijena = 0;
        for(Artikl a : artikli){
            ukupnaCijena += a.getCijena();
        }
        return ukupnaCijena;
    }
}
