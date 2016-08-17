/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

public class Publicacion extends Libro
{

    private static String titulo;
    
    private static double precio;
    private static int opt2;
    Libro lib = new Libro();
    Disco disc = new Disco();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static double getOpt2() {
        return opt2;
    }

    public void setOpt2(int opt2) {
        this.opt2 = opt2;
    }
    
    public void IngresarInfo()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el numero de paginas");
        lib.setNumPaginas(keyboard.nextInt());
        System.out.println("Ingrese el año de publicacion");
        lib.setAño(keyboard.nextInt());
    }

    public void IngresarInfoDisco()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese la duracion del disco");
        disc.setDuracion(keyboard.nextInt());
    }     
    public void MostrarDatos()
    {
        System.out.println(" Los datos de la publicacion son " + titulo + " y el pecio es " + precio);
        if (opt2 == 1)
            lib.MostrarLib(); 
        else if (opt2 == 2)
            disc.mostrarDisco();
    }
}
