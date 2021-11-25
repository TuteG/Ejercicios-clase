/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leeredad;

import java.util.Scanner;

public class LeerEdad {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int Edad;
        
        System.out.println("----Por favor ingrese sus datos----");
        System.out.print("Nombre y Apellido: ");
        String Nombre;
        Nombre = Leer.next();
        System.out.print("DNI: ");
        String DNI;
        DNI = Leer.next();
        System.out.print("Año de Nacimiento: ");
        int AñoDeNac;
        AñoDeNac = Leer.nextInt();
        
        Edad = 2021 - AñoDeNac;
        
        System.out.println("\n----Impresion de ficha----");
        System.out.println("* Nombre: " + Nombre);
        System.out.println("* DNI:" + DNI);
        System.out.println("* Año de Nacimiento: " +AñoDeNac);
        System.out.println("Edad: " +Edad);
    }
    
}
