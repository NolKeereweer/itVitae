/* 
* Naam: Nol Keereweer
* Test ruimte voor Opdracht_1
* Importeren van Opdracht_1 en methodes vanuit daar gebruiken
*/
import com.cert.Opdracht_1;

public class executeOpdracht {

    private static String accesCode = "2002";

        public static void main(String[] args) {
        //de method doen wordt uit Opdracht_1 gecalled
        Opdracht_1.doen();
        
        if (args[0].equals(accesCode)) {
            System.out.println(Opdracht_1.getGetal()); 
        } else  {
            System.out.println("Poging gefaald");
            return;
        }


    }

}
