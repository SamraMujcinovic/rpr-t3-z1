package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;



public class Imenik {
    private HashMap<String, TelefonskiBroj> map=new HashMap<String,TelefonskiBroj>();
    public void dodaj(String ime,TelefonskiBroj broj){
        map.put(ime, broj);
    }
    String dajBroj(String ime){
        return map.get(ime).ispisi();
    }
    String dajIme(TelefonskiBroj broj){
        for (Map.Entry <String,TelefonskiBroj> skup:map.entrySet()) {
            if(skup.getValue().equals(broj)) return skup.getKey();
        }
        return "";
    }

}
