
package detector;

/**
 *
 * @author Victus
 */
import java.util.Scanner;

public class Detector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE TICKET: ");
        String cadena = sc.nextLine();
        String subcadena = cadena.substring(3,5);
        
        if("ZN".equals(subcadena)){
            System.out.println("DIRIJASE A LA ZONA NORTE");
        }
        if("ZS".equals(subcadena)){
            System.out.println("DIRIJASE A LA ZONA SUR");
        }
        if("ZE".equals(subcadena)){
            System.out.println("DIRIJASE A LA ZONA ESTE");
        }
        if("ZO".equals(subcadena)){
            System.out.println("DIRIJASE A LA ZONA OESTE");
        }
    }
}
