
package modell;


public class Lada {
    public static final String BRONZ = "bronz";
    public static final String EZUST = "ezüst";
    public static final String ARANY = "arany";
    
    public boolean talaltE(String tipp){
        if (tipp.equals(Lada.EZUST)) {
            return true;
        }
        return false;
    }

}
