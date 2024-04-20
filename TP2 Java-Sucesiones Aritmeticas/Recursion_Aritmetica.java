package MATEMATICA_DISCRETA;

import java.util.Scanner;

public class Recursion_Aritmetica {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int a1 = 0, an = 0, n = 0, m = 0, d = 0;
        String recuperador = "";

        System.out.println("Dame el primer valor");
        a1 = teclado.nextInt();
        System.out.println("Dame el otro numero valor");
        an = teclado.nextInt();
        System.out.println("¿Son consecutivos? SI/NO");
        recuperador = teclado.nextLine();
        if (recuperador.equalsIgnoreCase("SI")) {
            m = 0;
        } else {
            System.out.println("¿Cuantos espacios hay entre ambos numeros?");
            m = teclado.nextInt();
        }
        System.out.println("Dime cuantos valores quieres recuperar");
        n = teclado.nextInt();
        
        d = (an - a1) / (m + 1);
        calculoAritmetico(a1, n - 1, d);

    }

    public static void calculoAritmetico(int a1, int n, int d) {

        System.out.print(a1);

        if (n > 0) {
            System.out.print(", ");
            calculoAritmetico(a1 + d, n - 1, d);            
        }

    }
}
