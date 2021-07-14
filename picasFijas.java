package Tareas;

/**
 * Nombre del programa: Picas y Fijas
 * Descripcion: Suponga que usted va a implementar en el computador el juego  "Picas y Fijas". Este juego consiste en adivinar un número de 4 dígitos diferentes en 10 intentos máximo. 
 * Para esto usted debe decirle al computador un número de 4 dígitos y el computador le contesta el número de picas y el número de fijas, hasta que usted adivine el número. 
 * Usted tiene una pica si el número que usted dijo tiene un dígito que coincide con un dígito del número a adivinar, pero está en diferente posición. Ej: si el número a adivinar es 4879 
 * y usted tecleó 8453, tiene 2 picas (por el 8 y el 4).
 * Usted tiene una fija si el número que usted dijo tiene un dígito que coincide con un dígito del número a adivinar, en la misma posición. Ej: si el número a adivinar es 4879 y usted 
 * tecleó 6859, tiene 2 fijas (por el 8 y el 9).
 * Realice:
 * (30%) Haga una función numeroPicas que reciba el número a adivinar y el número tecleado por el usuario, y retorne el número de picas que tiene. (15% algoritmo, 15% en Java).
 * (30%) Haga una función numeroFijas que reciba el número a adivinar y el número tecleado por el usuario, y retorne el número de fijas que tiene. (15% algoritmo, 15% en Java).
 * (20%) Haga una función ganoJuego que reciba el número a adivinar y el número tecleado por el usuario, y retorne true si ganó el juego (es decir, si tiene 4 fijas) o false si no. 
 * (10% algoritmo, 10% en Java).
 * (20%) Haga un programa PicasYFijas, que dado el número a adivinar (inicializado por usted), lea los números dados por el usuario hasta que el usuario gane o hasta que se cumplan 
 * los 10 intentos. (3% modelaje, 7% algoritmo y 10% en Java).
 * 
 * Autor: Kimberly C.
 * Fecha de creacion: 20-7-2020
 * Modificado por: Kimberly C.
 * fecha de modificacion: 20-7-2020
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class picasFijas {

    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException {
        /*int numero = 0;
        int resultadoJuego = 0;
        int num1 = 8453;

        intrucciones();
        
        for (int count = 1; count <= 10 && resultadoJuego != 1; count++) {
            int picas = 0;
            int fijas = 0;

            num1 = 8453;

            recibeNumero();

            numeroFijas(numero);

            numeroPicas(numero);

            ganoJuego();
        }// Fin del for

    } // Fin de la clase

    public static void intrucciones() {
        escribir.println("Juego de Picas y Fijas");
        escribir.println();
        escribir.println("Instrucciones:");
        escribir.println("*Solo se puede ingresar un numero de 4 digitos y diferentes entre si");
        escribir.println("*Solo tienes 10 intentos para adivinar");
        escribir.println();
        escribir.println();
    }

    public static void recibeNumero() throws IOException{
        int numero = 0;

        escribir.println();
        escribir.println("Digite un numero de 4 digitos: ");
        numero = Integer.parseInt(leer.readLine());
    }

    public static void separacion(int numero){
        int num1 = 0;

        int cuarto = numero % 10;

        numero = numero / 10;
        int tercero = numero % 10;

        numero = numero / 10;
        int segundo = numero % 10;

        numero = numero / 10;
        int primero = numero % 10;

        int cuartoN = num1 % 10;

        num1 = num1 / 10;
        int terceroN = num1 % 10;

        num1 = num1 / 10;
        int segundoN = num1 % 10;

        num1 = num1 / 10;
        int primeroN = num1 % 10;

        escribir.println(cuarto);
        escribir.println(tercero);
        escribir.println(segundo);
        escribir.println(primero);
    }
    
    public static Integer numeroPicas(int numero) throws IOException {
        int picas = 0;

        int primero=0, segundo=0, tercero=0, cuarto=0;
        int primeroN=0, segundoN=0, terceroN=0, cuartoN=0;

        
        if (primero == segundoN || primero == terceroN || primero == cuartoN) {
            picas++;
        }

        if (segundo == primeroN || segundo == terceroN || segundo == cuartoN) {
            picas++;
        }

        if (tercero == primeroN || tercero == segundoN || tercero == cuartoN) {
            picas++;
        }

        if (cuarto == primeroN || cuarto == segundoN || cuarto == terceroN) {
            picas++;
        }

        escribir.println();
        escribir.println("La cantidad de picas es de: " + picas);

        return picas;
    }

    public static Integer numeroFijas(int numero) {
        int fijas = 0;

        int primero=0, segundo=0, tercero=0, cuarto=0;
        int primeroN=0, segundoN=0, terceroN=0, cuartoN=0;

        if (primero == primeroN) {
            fijas++;
        }

        if (segundo == segundoN) {
            fijas++;
        }

        if (tercero == terceroN) {
            fijas++;
        }

        if (cuarto == cuartoN) {
            fijas++;
        }

        escribir.println();
        escribir.println("La cantidad de fijas es de: " + fijas);

        return fijas;

    }

    public static Integer ganoJuego() {
        int intentos = 0, resultadoJuego;

        int primero = 0, segundo = 0, tercero = 0, cuarto = 0;
        int primeroN = 0, segundoN = 0, terceroN = 0, cuartoN = 0;

        int count = 0;

        if (primero == primeroN && segundo == segundoN && tercero == terceroN && cuarto == cuartoN) {
            resultadoJuego = 1;
            escribir.println();
            escribir.println("Has ganado");
        } else {
            intentos = 10 - (count);
            escribir.println();
            escribir.println("Vidas restantes: " + intentos);
        }

        return intentos;*/

    }

}// Fin del Main