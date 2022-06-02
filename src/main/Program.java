package main;

import java.util.Scanner;
import modell.Jatekos;
import modell.Lada;

public class Program {
    Scanner sc;
    Jatekos j;
    Lada l;
    public static void main(String[] args) {   
        new Program().init();
    }
    
    void init(){
        //todo játék leírás 
        sc = new Scanner(System.in, "ISO-8859-1");// ü betűt kezelésére: ISO-8859-1
        j = new Jatekos();
        l = new Lada();
        
        System.out.println("Válassz egy Ládát: Bronz | Ezüst | Arany");
        System.out.print("Válaszod: ");
        j.setTipp(sc.nextLine());
        
        //System.out.println(j.getTipp());
        
        if (l.talaltE(j.getTipp())) {
            System.out.println("Sikeresen megtaláltad a kincset rejtő ládát");
        }
        else{
            System.out.println("Ez most nem siekrült");
        }

    }
}
