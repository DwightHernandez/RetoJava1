/*2. Programa validador de contraseñas
- 8 caracteres de longitud
- Contener minimo una mayuscula o minuscula
- Minimo un numero
- Minimo un caracter especial !, @, #, $, %, &, *.*/

package com.mycompany.retojava1;
import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la contraseña a validar: ");
        String contraseña = scanner.nextLine();
        int longitud = contraseña.length();
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        int caracteres = 0;
        int especiales = 0;
        int validacion = 0;

        if (longitud >= 8) {
            validacion += 1;
        }
        for (int i = 0; i < longitud; i++) {
            char caracter = contraseña.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas += 1;
            }
            if (Character.isLowerCase(caracter)) {
                minusculas += 1;
            }
            if (Character.isDigit(caracter)) {
                numeros += 1;
            }
            if (Character.isLetterOrDigit(caracter)) {
                caracteres += 1;
            }
            if (caracter == '!' || caracter == '@' || caracter == '#' || caracter == '$' || caracter == '%' || caracter == '&' || caracter == '*') {
                especiales += 1;
            }
        }
        if (mayusculas >= 1 || minusculas >= 1) {
            validacion += 1;
        }
        if (numeros >= 1) {
            validacion += 1;
        }
        if (caracteres >= 1) {
            validacion += 1;
        }
        if (especiales >= 1) {
            validacion += 1;
        }
        if (validacion == 5) {
            System.out.println("Contraseña valida");
        } else {
            System.out.println("Contraseña invalida");
        }

    }

}
