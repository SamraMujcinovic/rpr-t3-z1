package ba.unsa.etf.rpr.tutorijal03;
public enum Grad{
    BIHAC(0),ORASJE(1),TUZLA(2),ZENICA(3),GORAZDE(4),TRAVNIK(5),MOSTAR(6),SIROKI_BRIJEG(7),SARAJEVO(8),LIVNO(9),BRCKO(10);
    int indeks;
    Grad (int i){
        indeks=i;
    }
};

public class FiksniBroj extends TelefonskiBroj {
    private String broj;
    private Grad grad;
    public FiksniBroj(Grad grad,String broj){
        this.grad=grad;
        this.broj=broj;
    }
    public final String pozivni[]={"037","031","035","032","038","030","036","039","033","034","049"};
    public String getBroj(){
        return broj;
    }
    @Override
    public String ispisi(){
        String s=pozivni[grad.indeks];
        s+="/";
        s+=broj;
    }
    @Override
    public int hashCode(){
        return broj.hashCode();
    }
    

}
