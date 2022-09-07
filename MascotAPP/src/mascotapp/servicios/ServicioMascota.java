/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author PABLO
 */
public class ServicioMascota {
    private final Scanner leer = new Scanner(System.in);
    
    public Mascota crearMascota(){
        System.out.println("ingresar nombre");
        String nombre = leer.nextLine();
        System.out.println("ingresar apodo");
        String apodo = leer.nextLine();
        System.out.println("ingresar tipo");
        String tipo = leer.nextLine();
        
        return new Mascota(nombre, apodo,tipo);
        
    }
    
    
}
