package ba.unsa.etf.rpr.tutorijal03;

import java.util.*;
import ba.unsa.etf.rpr.tutorijal03.TelefonskiBroj ;
import ba.unsa.etf.rpr.tutorijal03.FiksniBroj.Grad;


public class Imenik {
    private HashMap<String, TelefonskiBroj> map=new HashMap<String,TelefonskiBroj>();

    public void dodaj(String ime,TelefonskiBroj broj){
        map.put(ime, broj);
    }

    public String dajBroj(String ime){
        return map.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        for (Map.Entry <String,TelefonskiBroj> skup:map.entrySet()) {
            if(skup.getValue().equals(broj)) return skup.getKey();
        }
        return "";
    }

    public String naSlovo(char s){
        String p="";
        int i=1;
        for(Map.Entry <String, TelefonskiBroj> skup: map.entrySet()){
            if(skup.getKey().charAt(0)==s){
                p+=i + ". " + skup.getKey() + " - " + skup.getValue().ispisi() + "\n";
                i++;
            }
        }
        return p;
    }

    public Set<String> izGrada(Grad g){
        SortedSet<String>  skup= new TreeSet();
        for(Map.Entry<String,TelefonskiBroj> s: map.entrySet()){
            if(s.getValue().dajBroj().substring(0,3).equals(g.getPozivni())) skup.add(s.getKey());
        }
        return skup;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        SortedSet<TelefonskiBroj> skup = new TreeSet<>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
                return o1.ispisi().compareTo(o2.ispisi());
            }
        });
        for(Map.Entry<String, TelefonskiBroj> s: map.entrySet()){
            if(s.getValue() instanceof FiksniBroj && s.getValue().dajBroj().substring(0,3).equals(g.getPozivni())) skup.add(s.getValue());
        }
        return skup;
    }





}
