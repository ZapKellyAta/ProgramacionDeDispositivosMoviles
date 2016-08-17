/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Cloud
 */
public class Cilindro extends Circulo{
    
    private double altura;

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double Area() {
        return (2*Math.PI*Math.pow(this.LeerRadio(),2)+2*Math.PI*this.LeerRadio()*altura);
    }
    public double Volumen() {
        return (altura*Math.PI*Math.pow(this.LeerRadio(),2));
    }

    public double LeerAltura() {
        return altura;
    }
}
