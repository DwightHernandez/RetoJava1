/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retojava1;

/**
 *
 * @author kevin
 */
/*
a partir del siguiente codigo en python, realiza una explicacion del funcionamiento y una traduccion al lenguaje java:
a, b = 0,1
for _ in range(10):
    print(a, end = " ")
    a,b = b, a + b
print()
*/

public class ejercicio4 {
    
   public static void main(String[] args) {
  double a = 0.1;
  double b = 0.1;
  double c = a+b;
   for (int i = 0; i < 10; i++) {
           System.out.println(a + " ");
           a = b + c;
           b = a + c;
       }
       System.out.println("");
   }
}