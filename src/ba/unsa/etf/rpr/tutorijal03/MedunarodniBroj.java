package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj{
    String drzava;
    String broj;
    public MedunarodniBroj(String drzava, String broj){
        this.drzava=drzava;
        this.broj=broj;
    }
    @Override
    String ispisi(){
        String s=drzava+broj;
        return s;
    }
    @Override
    int hashCode(){
        return broj.hashCode();
    }
}
