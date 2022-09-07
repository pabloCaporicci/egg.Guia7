/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioaprendizaje02;

import entidades.Circunferencia;

/**
 *
 * @author PABLO
 */
public class Guia7EjercicioAprendizaje02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia Circulo = new Circunferencia();
        
        Circulo.crearCircunferencia();
        
        System.out.println("El área es igual a " + Circulo.area());

        System.out.println("El perímetro es igual a " + Circulo.perimetro());
    }
    
}
