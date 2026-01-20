import java.util.Scanner;
/**
 *Problema: Solicite un número entero ny muestre su tabla del 1 al 12.  
 * @author Usuario iTC
 */
public class ForBasico {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int n, resultado;
        System.out.print("Ingrese un numero para ver su tabla de multiplicar: ");
        n = tcl.nextInt();
        if (n <= 0) {
            System.out.println("Error: Por favor ingrese un número positivo.");
        } else {
            System.out.println("Tabla de multiplicar del " + n + ":");
            for (int i = 1; i <= 12; i++) {
                resultado = n * i;
                System.out.println(n + " x " + i + " = " + resultado);
            }
        }
    }
}
/**
 * run:
Ingrese un numero para ver su tabla de multiplicar: 6
Tabla de multiplicar del 6:
6 x 1 = 6
6 x 2 = 12
6 x 3 = 18
6 x 4 = 24
6 x 5 = 30
6 x 6 = 36
6 x 7 = 42
6 x 8 = 48
6 x 9 = 54
6 x 10 = 60
6 x 11 = 66
6 x 12 = 72
BUILD SUCCESSFUL (total time: 8 seconds)
 */