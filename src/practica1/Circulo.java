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
public class Circulo {
    private double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double LeerRadio() {
        return radio;
    }

    public double Area() {
        return (Math.PI*Math.pow(radio,2));
    }
    
    public double Longitud() {
        return (Math.PI*2*radio);
    }
}
