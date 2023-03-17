
package com.mycompany.actividad2_19;

import java.util.Scanner;

public class Actividad2_19 {

    public static void main(String[] args) {
      Scanner leerporteclado = new Scanner(System.in);
      
      double perimetro, lado, altura, area;
      
        System.out.print("Ingrese el valor del lado en cm: ");
        lado = leerporteclado.nextDouble();
        
        perimetro = lado * 3;
       
        altura = (Math.sqrt(3) / 2) * lado;
       
        area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);
        
        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("La altura del triángulo es: " + altura);
        System.out.println("El área del triángulo es: " + area + " Unidades cuadradas");
      
    }
}
