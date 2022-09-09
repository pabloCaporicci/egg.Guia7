    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author PABLO
 */
public class Cuenta {
    private int numCuenta;
    private double saldo;
    private long dni;
    private String nombre;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, double saldo, long dni, String nombre) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public void crear() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese su DNI");
        dni = leer.nextLong();
        numCuenta = (int) (Math.random() * 14875);

        System.out.println("Bienvenido " + nombre + ", su numero de cuenta es " + numCuenta + " su saldo es " + saldo);
    }

    public void ingresa(double ingreso) {
        saldo +=ingreso;
    }

    public void retira(double retiro) {
        if (retiro<=saldo) {
            saldo = saldo - retiro;
        }else{
            saldo = 0;
        }
        
    }
    
    public void extraccionRapida(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("puede retirar hasta un 20% de su saldo, ingrese un monto");
        double retir=leer.nextDouble();
        
        while (retir > saldo*0.2){
            System.out.println("Ingrese un monto menor no superior a: "+(saldo* 0.20));
            retir=leer.nextDouble();
        }
        
        saldo -= retir;
    }
    public void consultarSaldo(){
        System.out.println("Su saldo es: "+saldo);
    }
    public void cosultarDatos(){
            System.out.println(nombre+" \n "+ numCuenta+" \n "+dni+" \n "+saldo);
    }

}
