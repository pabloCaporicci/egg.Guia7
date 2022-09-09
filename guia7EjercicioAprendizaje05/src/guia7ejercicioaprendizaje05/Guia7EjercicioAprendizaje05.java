/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioaprendizaje05;

import entidades.Cuenta;

/**
 *
 * @author PABLO
 */
public class Guia7EjercicioAprendizaje05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cuenta c1=new Cuenta(), c2=new Cuenta();
       //Cuenta c2=new Cuenta();
       c1.crear();
       c2.crear();
       c1.ingresa(10450);
       c2.ingresa(1450);
       c1.cosultarDatos();
       c1.consultarSaldo();
       c2.cosultarDatos();
       c2.consultarSaldo();

    }
    
}
