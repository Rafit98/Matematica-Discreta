package MATEMATICA_DISCRETA;

import java.util.Scanner;

public class TRANSFORMAR_BINARIOS {

    public static void main(String arg[]) {
        Scanner teclado = new Scanner(System.in);
        String recupera = "";
        int numero[] = new int[16];
        int contador = 0;
        boolean termino = true;

        while (termino) {
            int decimal = 0;
            String octal = "", hexadecimal = "";
            System.out.println("Ingrese un numero binario de de hasta 16 digitos y sin espacio");
            recupera = teclado.nextLine();

            if (recupera.length() <= 16) {
                int diferencia = 16 - recupera.length();
                contador = diferencia;
                for (int i = 0; i < diferencia; i++) {
                    numero[i] = 0;
                }
                for (int i = 0; i < recupera.length(); i++) {
                    char a = recupera.charAt(i);
                    if (a == '1' || a == '0') {
                        numero[(diferencia + i)] = Character.getNumericValue(a);
                        contador++;
                    }
                }
                if (contador == 16) {
                    for (int j = 0; j < 16; j++) {
                        decimal = decimal + (numero[j] * (int) Math.pow(2, 15 - j));
                    }
                    System.out.println("En decimal es un " + decimal);

                    int al = 0, bl = 0, cl = 0, dl = 0, el = 0, fl = 0;
                    al = (numero[0] * (int) Math.pow(2, 0));
                    bl = (numero[1] * (int) Math.pow(2, 2)) + (numero[2] * (int) Math.pow(2, 1)) + (numero[3] * (int) Math.pow(2, 0));
                    cl = (numero[4] * (int) Math.pow(2, 2)) + (numero[5] * (int) Math.pow(2, 1)) + (numero[6] * (int) Math.pow(2, 0));
                    dl = (numero[7] * (int) Math.pow(2, 2)) + (numero[8] * (int) Math.pow(2, 1)) + (numero[9] * (int) Math.pow(2, 0));
                    el = (numero[10] * (int) Math.pow(2, 2)) + (numero[11] * (int) Math.pow(2, 1)) + (numero[12] * (int) Math.pow(2, 0));
                    fl = (numero[13] * (int) Math.pow(2, 2)) + (numero[14] * (int) Math.pow(2, 1)) + (numero[15] * (int) Math.pow(2, 0));

                    octal = "" + al + bl + cl + dl + el + fl;
                    System.out.println("En octal es un " + octal);

                    int ah = 0, bh = 0, ch = 0, dh = 0;
                    ah = (numero[0] * (int) Math.pow(2, 3)) + (numero[1] * (int) Math.pow(2, 2)) + (numero[2] * (int) Math.pow(2, 1)) + (numero[3] * (int) Math.pow(2, 0));
                    bh = (numero[4] * (int) Math.pow(2, 3)) + (numero[5] * (int) Math.pow(2, 2)) + (numero[6] * (int) Math.pow(2, 1)) + (numero[7] * (int) Math.pow(2, 0));
                    ch = (numero[8] * (int) Math.pow(2, 3)) + (numero[9] * (int) Math.pow(2, 2)) + (numero[10] * (int) Math.pow(2, 1)) + (numero[11] * (int) Math.pow(2, 0));
                    dh = (numero[12] * (int) Math.pow(2, 3)) + (numero[13] * (int) Math.pow(2, 2)) + (numero[14] * (int) Math.pow(2, 1)) + (numero[15] * (int) Math.pow(2, 0));

                    if (ah < 10) {
                        hexadecimal = "" + ah;
                    } else if (ah == 10) {
                        hexadecimal = "A";
                    } else if (ah == 11) {
                        hexadecimal = "B";
                    } else if (ah == 12) {
                        hexadecimal = "C";
                    } else if (ah == 13) {
                        hexadecimal = "D";
                    } else if (ah == 14) {
                        hexadecimal = "E";
                    } else if (ah == 15) {
                        hexadecimal = "F";
                    }

                    if (bh < 10) {
                        hexadecimal += bh;
                    } else if (bh == 10) {
                        hexadecimal += "A";
                    } else if (bh == 11) {
                        hexadecimal += "B";
                    } else if (bh == 12) {
                        hexadecimal += "C";
                    } else if (bh == 13) {
                        hexadecimal += "D";
                    } else if (bh == 14) {
                        hexadecimal += "E";
                    } else if (bh == 15) {
                        hexadecimal += "F";
                    }

                    if (ch < 10) {
                        hexadecimal += ch;
                    } else if (ch == 10) {
                        hexadecimal += "A";
                    } else if (ch == 11) {
                        hexadecimal += "B";
                    } else if (ch == 12) {
                        hexadecimal += "C";
                    } else if (ch == 13) {
                        hexadecimal += "D";
                    } else if (ch == 14) {
                        hexadecimal += "E";
                    } else if (ch == 15) {
                        hexadecimal += "F";
                    }

                    if (dh < 10) {
                        hexadecimal += dh;
                    } else if (dh == 10) {
                        hexadecimal += "A";
                    } else if (dh == 11) {
                        hexadecimal += "B";
                    } else if (dh == 12) {
                        hexadecimal += "C";
                    } else if (dh == 13) {
                        hexadecimal += "D";
                    } else if (dh == 14) {
                        hexadecimal += "E";
                    } else if (dh == 15) {
                        hexadecimal += "F";
                    }

                    System.out.println("En hexadecimal es un " + hexadecimal);
                    termino = true;
                    contador = 0;
                } else {
                    System.out.println("ERROR, EL NUMERO SOLO ADMITE 1 Y 0");
                }

            } else {
                System.out.println("ERROR, EL NUMERO SOLO ADMITE HASTA 16 DIGITOS");
            }
        }
    }

}
