
package modell;

public class Jatekos {
    public static final String TIPP_BRONZ = "bronz";
    public static final String TIPP_EZUST = "ezüst";
    public static final String TIPP_ARANY = "arany";
    
    private String tipp;

    public Jatekos() {
        this("");
    }

    public Jatekos(String tipp) {
        this.tipp = tipp;
    }

    public String getTipp() {
        return tipp;
    }

    public void setTipp(String tipp) {
        this.tipp = tipp;
    }
    
    
}
