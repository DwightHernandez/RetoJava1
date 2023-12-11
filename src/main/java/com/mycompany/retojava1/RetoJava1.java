/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*Escribe un programa en java que calcule la suma de todos los numeros que son multiplos 
de 3 y 5 y que sean menores que un numero N (numero dado por usuario), 
ademas excluye aquellos numero que sean multiplos entre ambos 3 y 5*/

package com.mycompany.retojava1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class RetoJava1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el numero limite: ");
        int N = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("Suma de multiplos: " + sum);

    }
}
// imprimir si N es multiplo de 3 o 5
