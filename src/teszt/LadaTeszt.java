
package teszt;

import modell.Jatekos;
import modell.Lada;


public class LadaTeszt {
    public static void main(String[] args) {
        System.out.println("******Teszt******\n");
        new LadaTeszt().ladaTalaltTeszt(Jatekos.TIPP_EZUST);
        new LadaTeszt().ladaNemTalaltTeszt(Jatekos.TIPP_ARANY);
        new LadaTeszt().ladaNemTalaltTeszt(Jatekos.TIPP_BRONZ);
        System.out.println("*****Teszt VÉGE*****");
    }
    
    public void ladaTalaltTeszt(String tipp){
        System.out.println("**Talált teszt**");
        Lada l = new Lada();
        String t=l.talaltE(tipp);
        String valasz=String.format("Sikerült %s", Lada.VISSZAJELZES);
        assert t.equals(valasz):"nem jó a találat ellenőrzés";
        System.out.println("Talált teszt sikeres\n");
    }

    private void ladaNemTalaltTeszt(String tipp) {
        System.out.println("**Nem talált teszt**");
        Lada l = new Lada();
        String t=l.talaltE(tipp);
        String valasz=String.format("Nem sikerült %s", Lada.VISSZAJELZES);
        assert t.equals(valasz):"nem jó a találat ellenőrzés";
        System.out.println("Nem talált teszt sikeres\n");
    }
}
