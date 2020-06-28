package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    public List<Artikl> artikli;

    public void dodajArtikl(Artikl artikl){
        artikli.add(artikl);
    }

    public Artikl[] getArtikli() {
        Artikl[] nizArtikala = new Artikl[1000];
        int i = 0;

        for(Artikl a : artikli){
            nizArtikala[i] = a;
            i++;
        }
        return nizArtikala;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(Artikl a : artikli){
            if(a.getKod().equals(kod)) {
                artikli.remove(a);
                return a;
            }
        }
        return null;
    }
}
