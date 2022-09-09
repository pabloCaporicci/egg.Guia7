/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioaprendizaje09;

import guia7ejercicioaprendizaje09.entidades.Matematica;


/**
 *
 * @author PABLO
 */
public class Guia7EjercicioAprendizaje09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematica operaciones = new Matematica();
        
        operaciones.setNumero1(Math.random()*10);
        operaciones.setNumero2(Math.random()*10);
        
        System.out.println("los valores seteados son: "+operaciones.getNumero1()+" para el primer valor y "+operaciones.getNumero2()+" para el segundo");
        
        operaciones.devolverMayor();
        operaciones.calcularPotencia();
        operaciones.calcularRaiz();
        
    }
    
}
