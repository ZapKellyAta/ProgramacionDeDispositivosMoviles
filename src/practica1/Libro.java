/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

public class Libro
{
    private int numPaginas, año, numVendidos;

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumVendidos() {
        return numVendidos;
    }

    public void setNumVendidos(int numVendidos) {
        this.numVendidos = numVendidos;
    }
    
    
    public void MostrarLib()
    {
        System.out.println("El numero de paginas del libro es " + numPaginas + 
        "y el año de publicacion es " + año);
    }
}
