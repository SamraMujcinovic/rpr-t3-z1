package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    String broj;
    int mobilnaMreza;
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

}
