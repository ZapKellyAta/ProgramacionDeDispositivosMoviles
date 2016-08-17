/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

public class Disco 
{
    private int duracion, numDiscosVendidos;

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNumDiscosVendidos() {
        return numDiscosVendidos;
    }

    public void setNumDiscosVendidos(int numDiscosVendidos) {
        this.numDiscosVendidos = numDiscosVendidos;
    }
    
    public void mostrarDisco()
    {
        System.err.println("La duracion del disco es " + duracion);
    }
}
