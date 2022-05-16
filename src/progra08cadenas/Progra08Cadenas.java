/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra08cadenas;

/**
 *
 * @author HP
 */
public class Progra08Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "jonathan";
        System.out.println(nombre);
        
        String letra = String.valueOf(nombre.charAt(0));
        System.out.println(letra);
        
        letra = letra.toUpperCase();
        System.out.println(letra);
        
        String posicion2 = String.valueOf(nombre.charAt(2));
        System.out.println(posicion2);
        posicion2 = posicion2.toUpperCase();
        posicion2 = posicion2.toLowerCase();
        
        System.out.println(nombre + " " + letra + " " + posicion2);
        String cadena = posicion2 + letra;
    }
    
}
