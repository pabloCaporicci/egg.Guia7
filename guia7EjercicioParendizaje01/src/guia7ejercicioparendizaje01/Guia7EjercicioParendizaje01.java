/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioparendizaje01;

import entidades.Libro;

/**
 *
 * @author PABLO
 */
public class Guia7EjercicioParendizaje01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro Armado = new Libro();
        Libro l1 = Armado.crearLibro();
        System.out.println(Armado.informarLibro());
        
    }
    
}
