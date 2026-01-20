import java.util.Scanner;
/**
 *Problema: Ingrese un entero N(>=1). Calcula la suma 1+2+...+N usando:     
mientras
hacer mientras
para
Muestre los tres resultados y verifique que coincidan.
 * @author Usuario iTC
 */
public class ComparacionCiclos {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
                int n, i;
        int sumaWhile = 0, sumaDoWhile = 0, sumaFor = 0;
        do {
            System.out.print("Ingrese un numero entero : ");
            n = tcl.nextInt();
            if (n < 1) {
                System.out.println("Error: El número debe ser mayor o igual a 1.");
            }
        } while (n < 1);
        i = 1;
        while (i <= n) {
            sumaWhile += i;
            i++; 
        }
        i = 1; 
        do {
            sumaDoWhile += i;
            i++;
        } while (i <= n);
        for (int j = 1; j <= n; j++) {
            sumaFor += j;
        }
        System.out.println("Suma con while: " + sumaWhile);
        System.out.println("Suma con do-while: " + sumaDoWhile);
        System.out.println("Suma con for: " + sumaFor);
        if (sumaWhile == sumaDoWhile && sumaDoWhile == sumaFor) {
            System.out.println("Los resultados coinciden");
        } else {
            System.out.println("Revisar implementación.");
        }
    }
}
/**
 * run:
Ingrese un numero entero : 3
Suma con while: 6
Suma con do-while: 6
Suma con for: 6
Los resultados coinciden
BUILD SUCCESSFUL (total time: 4 seconds)
 */