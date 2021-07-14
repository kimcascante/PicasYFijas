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

public class pruebaExtra {

    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException {
        int num1=8453;
        int numero, picas=0, fijas=0;
        int resultadoJuego=0;
        
        escribir.println("Juego de Picas y Fijas");
        escribir.println();
        escribir.println("Instrucciones:");
        escribir.println("*Solo se puede ingresar un numero de 4 digitos y diferentes entre si");
        escribir.println("*Solo tienes 10 intentos para adivinar");
        escribir.println();
        escribir.println();

        for (int count = 1; count<=10 && resultadoJuego!=1; count++) {
            picas=0;
            fijas=0;
            
            num1=8453;

        escribir.println();
        escribir.println("Digite un numero de 4 digitos: ");
        numero = Integer.parseInt(leer.readLine());

        picas = numeroPicas(numero, num1);
        fijas = numeroFijas(numero, num1);
        //ganoJuego(numero, num1);
    
        escribir.println("La cantidad de fijas es de: " +fijas);
        escribir.println();
        escribir.println("La cantidad de picas es de: " +picas);

        resultadoJuego = ganoJuego(numero, num1, count);
        }//Fin del for*/
    }// Fin del Main
        
    public static int numeroPicas(int pNumero, int pNum1){
        int picas=0;

        //Inicio de separacion del numero del usuario
        int cuarto = pNumero % 10;

        pNumero = pNumero / 10;
        int tercero = pNumero % 10;

        pNumero = pNumero / 10;
        int segundo = pNumero % 10;

        pNumero = pNumero / 10;
        int primero = pNumero % 10;

        //Inicio de separacion del numero 8453
        int cuartoN = pNum1 % 10;
        
        pNum1 = pNum1 / 10;
        int terceroN = pNum1 % 10;

        pNum1 = pNum1 / 10;
        int segundoN = pNum1 % 10;

        pNum1 = pNum1 / 10;
        int primeroN = pNum1 % 10;

        if(primero == segundoN || primero == terceroN || primero == cuartoN) {
            picas++;
        }

        if(segundo == primeroN || segundo == terceroN || segundo == cuartoN) {
            picas++;
        }

        if(tercero == primeroN || tercero == segundoN || tercero == cuartoN) {
            picas++;
        }

        if(cuarto == primeroN || cuarto == segundoN || cuarto == terceroN) {
            picas++;
        }

        return picas;

    }// Fin de la rutina numeroPicas

    public static int numeroFijas(int pNumero, int pNum1){
        int fijas=0;

        //Inicio de separacion del numero del usuario
        int cuarto = pNumero % 10;

        pNumero = pNumero / 10;
        int tercero = pNumero % 10;

        pNumero = pNumero / 10;
        int segundo = pNumero % 10;

        pNumero = pNumero / 10;
        int primero = pNumero % 10;

        //Inicio de separacion del numero 8453
        int cuartoN = pNum1 % 10;
        
        pNum1 = pNum1 / 10;
        int terceroN = pNum1 % 10;

        pNum1 = pNum1 / 10;
        int segundoN = pNum1 % 10;

        pNum1 = pNum1 / 10;
        int primeroN = pNum1 % 10;

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

        return fijas;
    }// Fin de la rutina numeroFijas

    public static int ganoJuego(int pNumero, int pNum1, int pCount){
        int resultadoJuego=0, intentos=0;

        //Inicio de separacion del numero del usuario
        int cuarto = pNumero % 10;

        pNumero = pNumero / 10;
        int tercero = pNumero % 10;

        pNumero = pNumero / 10;
        int segundo = pNumero % 10;

        pNumero = pNumero / 10;
        int primero = pNumero % 10;

        //Inicio de separacion del numero 8453
        int cuartoN = pNum1 % 10;
        
        pNum1 = pNum1 / 10;
        int terceroN = pNum1 % 10;

        pNum1 = pNum1 / 10;
        int segundoN = pNum1 % 10;

        pNum1 = pNum1 / 10;
        int primeroN = pNum1 % 10;

        if(primero == primeroN && segundo == segundoN && tercero == terceroN && cuarto == cuartoN){
            resultadoJuego = 1;
            escribir.println();
            escribir.println("Has ganado");
        } else {
            intentos = 10 - (pCount);
            escribir.println();
            escribir.println("Vidas restantes: " +intentos);
        }

        return resultadoJuego;
    } //Fin de la rutina gano juego

}// Fin de la clase