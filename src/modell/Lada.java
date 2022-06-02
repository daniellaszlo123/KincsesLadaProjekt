
package modell;


public class Lada {
    public static final String BRONZ = "bronz";
    public static final String EZUST = "ezüst";
    public static final String ARANY = "arany";
    
    private String bronzFelirat;
    private String ezustFelirat;
    private String aranyFelirat;
    
    private String leiras;

    public Lada() {
        this("3 láda közül az egyik rejti a kincset. "
                + "Mindegyiken van egy felirat (ami nem változtatható, mert belevésték a ládába),"
                + " de csak az egyik láda állítása igaz!");
    }
    
    
    public Lada(String leiras) {
        this.leiras = leiras;
        this.aranyFelirat = "én rejtem a kincset";
        this.ezustFelirat = "nem én rejtem a kincset";
        this.bronzFelirat = "az arany hazudik";
    }

    public String getLeiras() {
        return leiras;
    }

    public String getBronzFelirat() {
        return bronzFelirat;
    }

    public String getEzustFelirat() {
        return ezustFelirat;
    }

    public String getAranyFelirat() {
        return aranyFelirat;
    }    
    
    
    public String talaltE(String tipp){
        String visszajelzes="megtalálnod a kincset rejtő ládát.";
        if (tipp.equals(Lada.EZUST)) {
            return String.format("Sikerült %s", visszajelzes);
        }
        return String.format("Nem sikerült %s", visszajelzes);
    }

}
