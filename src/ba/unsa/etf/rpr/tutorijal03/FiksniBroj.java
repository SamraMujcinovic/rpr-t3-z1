package ba.unsa.etf.rpr.tutorijal03;


public class FiksniBroj extends TelefonskiBroj {
    public enum Grad{
        BIHAC(0),ORASJE(1),TUZLA(2),ZENICA(3),GORAZDE(4),TRAVNIK(5),MOSTAR(6),SIROKI_BRIJEG(7),SARAJEVO(8),LIVNO(9),BRCKO(10);
        int indeks;
        public final String pozivni[] = {"037", "031", "035", "032", "038", "030", "036", "039", "033", "034", "049"};
        Grad (int i){
            indeks=i;
        }
        public String getPozivni() {

            return pozivni[indeks];
        }

    }
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
        return s;
    }
    @Override
    public int hashCode(){
        return broj.hashCode();
    }
    @Override
    public boolean equals(Object o) {
        FiksniBroj a=(FiksniBroj)o;
        return broj.equals(a.broj);
    }
    public String dajBroj() { return broj; }

}
