/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioaprendizaje04;

import entidades.Rectangulo;

/**
 *
 * @author PABLO
 */
public class Guia7EjercicioAprendizaje04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectang1 = new Rectangulo();

        rectang1.datos();
        System.out.println("La super del rectangulo es: "+rectang1.superficie());
        System.out.println("El perímetro del rectangulo es: "+rectang1.perimetro());  
        rectang1.forma();
    }
    
}
