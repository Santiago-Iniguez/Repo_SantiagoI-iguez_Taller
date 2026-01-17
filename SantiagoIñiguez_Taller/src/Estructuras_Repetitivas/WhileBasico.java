
import java.util.Scanner;
/**
 *Problema: Defina una contraseña correcta (por ejemplo: "utpl").
Pida al ingresar usuario una contraseña hasta que sea correcta.
 * @author Usuario iTC
 */
public class WhileBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);       
        String passCorrecta = "utpl";
        String intentoPass = "";
        int contador = 0;
        while (!intentoPass.equals(passCorrecta)) {
            System.out.print("Ingrese la contraseña: ");
            intentoPass = tcl.next();
            contador++; 
        }
        System.out.println("Acceso concedido en " + contador + " intento(s).");    
    }
}

