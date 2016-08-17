/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Kelly
 */
public class Area 
{
    int radio = 0;
    double area = 0;
    double base,altura,lado;

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
    
    public double calcularCirculo()
    {
        area = Math.PI*Math.pow(radio,2);
        return area;
    }
    
    public double calcularTriangulo()
    {
        area = (base*altura)/2;
        return area;
    }
    
    public double calcularCuadrado()
    {
        area = Math.pow(lado,2);
        return area;
    }
    
    public double calcularRectangulo()
    {
        area = (base*altura);
        return area;
    }
}
