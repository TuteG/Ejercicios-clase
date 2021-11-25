/*
Se necesita crear un vector estático  de tipo double que tenga como resultado útiles escolares.
Imprimiendo en pantalla:
Litado de precios de los Útiles escolares
Lapicera  $ 40.5
Cuaderno  $ 139.99
Cartuchera  $ 560.5
Mochila  $ 1399.99

 */
package vectores2210;


public class Vectores2210 {

    
    public static void main(String[] args) {
        
        double precio[] = new double[4];
        precio[0] = 40.5;
        precio[1] = 139.99;
        precio[2] = 560.5;
        precio[3] = 1399.99;
        
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("°°°°Lista de precios°°°°");
        System.out.println("*Lapicera: $ " + precio[0]);
        System.out.println("*Cuaderno: $ " + precio[1]);
        System.out.println("*Cartuchera: $ " + precio[2]);
        System.out.println("*Mochila: $ " + precio[3]);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°");
        System.out.println("°°°°El mejor precio°°°°°");
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°");
        
        
                
    }
    
}
