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
public class Libro {
    public String ISBN;
    public String Titulo;
    public String autor;
    public int Paginas;

    public Libro() {
    }

    public Libro(String ISBN, String Titulo, String autor, int Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.autor = autor;
        this.Paginas = Paginas;
    }
     public Libro crearLibro(){
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de ISBN del libro");
        ISBN=leer.next();
        System.out.println("Ingrese el titulo del libro");
        Titulo=leer.next();
        System.out.println("Ingrese el autor del libro");
        autor=leer.next();
        System.out.println("Ingrese la cantidad de paginas del libro");
        Paginas=leer.nextInt();
        return new Libro(ISBN, Titulo, autor, Paginas);
    }
     public String informarLibro(){
         String respuesta = "ISBN: "+ISBN+" Título: "+Titulo+" Autor: "+autor+" Paginas: "+Paginas ;
         return respuesta; 
     }
}
