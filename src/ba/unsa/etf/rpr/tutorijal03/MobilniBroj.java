package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    private String broj;
    private int mobilnaMreza;
    public MobilniBroj(int mobilnaMreza,String broj){
        this.mobilnaMreza=mobilnaMreza;
        this.broj=broj;
    }
    @Override
    public String ispisi(){
        String s='0'+mobilnaMreza+'/'+broj;
        return s;
    }
    @Override
    public int hashCode(){
        return broj.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        MobilniBroj a=(MobilniBroj)o;
        return broj.equals(a.broj);
    }
    public String dajBroj() { return broj; }

}
