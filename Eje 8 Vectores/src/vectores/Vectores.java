/*
Realizar un programa que contenga 3 vectores estáticos con la siguiente 
informacion :
-Nombre
-Edad
-Sexo
Cargar los tres vectores con datos (5 usuarios) y recorrer los 3 vectores,
para imprimir el listado de usuarios por consola.
 */
package vectores;


public class Vectores {

    
    public static void main(String[] args) {
        String nombre[] = new String[5];
        nombre[0] = "Martin";
        nombre[1] = "Sol";
        nombre[2] = "Florencia";
        nombre[3] = "Maxi";
        nombre[4] = "Facundo";
        
        
        int edad[] = new int[5];
        edad[0] = 20;
        edad[1] = 23;
        edad[2] = 24;
        edad[3] = 26;
        edad[4] = 30;
        
        String sexo[] = new String[5];
        sexo[0] = "Masculino";
        sexo[1] = "Femenino";
        sexo[2] = "Femenino";
        sexo[3] = "Masculino";
        sexo[4] = "Masculino";
        
        System.out.println(nombre[0] + "    | " + edad[0] + " | " + sexo[0]);
        System.out.println(nombre[1] + "       | " + edad[1] + " | " + sexo[1]);
        System.out.println(nombre[2] + " | " + edad[2] + " | " + sexo[2]);
        System.out.println(nombre[3] + "      | " + edad[3] + " | " + sexo[3]);
        System.out.println(nombre[4] + "   | " + edad[4] + " | " + sexo[4]);
 

    }
    
}
