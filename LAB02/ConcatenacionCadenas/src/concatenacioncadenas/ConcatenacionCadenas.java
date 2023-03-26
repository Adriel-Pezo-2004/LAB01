package concatenacioncadenas;

/**
 *
 * @author Victus
 */
import java.util.Scanner;

public class ConcatenacionCadenas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de casa:");
        String numeroCasa = sc.nextLine();
        
        System.out.println("Ingrese el nombre de la calle:");
        String nombreCalle = sc.nextLine();
        
        System.out.println("Ingrese la ciudad:");
        String ciudad = sc.nextLine();
        
        System.out.println("Ingrese el estado:");
        String estado = sc.nextLine();
        
        System.out.println("Ingrese el código postal:");
        String codigoPostal = sc.nextLine();
        
        String direccionCompleta = numeroCasa + " " + nombreCalle + ", " + ciudad + ", " + estado + " " + codigoPostal;
        
        System.out.println("La dirección completa es:");
        System.out.println(direccionCompleta);
    }

}