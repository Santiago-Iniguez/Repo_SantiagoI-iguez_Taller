import java.util.Scanner;
/**
 *Problema: Solicite N(1..50). Cree un arreglo de Nenteros y cargue valores por 
 * teclado.
 * @author Santiago Iñiguez
 */
public class ArregloCarga {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese el tamaño del arreglo (1-50): ");
            n = tcl.nextInt();           
            if (n < 1 && n > 50) {
                System.out.println("Error: N fuera de rango. Intente de nuevo.");
            }
        } while (n < 1 && n > 50);
        int[] valores = new int[n];
        System.out.println("Cargando " + n + " valores:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese valor para la posición [" + i + "]: ");
            valores[i] = tcl.nextInt();
        }
        System.out.println("Carga completada.");        
    }
}
