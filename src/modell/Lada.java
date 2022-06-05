
package modell;


public class Lada {
    public static final String VISSZAJELZES="megtalálnod a kincset rejtő ládát.";
    
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
        if (tipp.equals(Jatekos.TIPP_EZUST)) {
            return String.format("Sikerült %s", VISSZAJELZES);
        }
        return String.format("Nem sikerült %s", VISSZAJELZES);
    }

}
