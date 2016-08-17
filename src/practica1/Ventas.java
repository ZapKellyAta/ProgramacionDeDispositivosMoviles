/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Kelly
 */
public class Ventas extends Publicacion
{

    Ventas ()
    {
        
    }
    
    Ventas(int opt2, String titulo, double precio, int NumPaginas, int año, int numVendidos) 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Leer()
    {
        Scanner keyboard = new Scanner(System.in);
        //Array de objetos creados para 10 publicaciones
                   Ventas arrayObjetos[] = new Ventas[10];
                   //Ingresamos los datos de las 10 publicaciones
                   for(int i=0;i<=9;i++)
                   {
                       System.out.println("Ingrese el titulo de la publicacion(Sin espacios)");
                       String titulo = keyboard.next();
                       
                       System.out.println("Ingrese el precio de la publicacion(Sin espacios)");
                        double precio = keyboard.nextDouble();
                        
                        System.out.println("La publicacion es un libro?");
                        System.out.println("1 SI");
                        System.out.println("2 NO, es un disco");
                        int opt2 = keyboard.nextInt();
                        if(opt2 ==1)
                        {
                            System.out.println("Ingrese el numero de paginas");
                            int NumPaginas = keyboard.nextInt();
                            System.out.println("Ingrese el año de publicacion");
                            int año = keyboard.nextInt();
                            System.out.println("Ingrese el numero de vendidos");
                            int numVendidos = keyboard.nextInt();
                            ven.setOpt2(1);
                            arrayObjetos[i] = new Ventas(opt2,titulo,precio,NumPaginas,
                            año,numVendidos);                        
                        }
                        else if(opt2 == 2)
                        {
                            ven.IngresarInfoDisco();
                            ven.setOpt2(2);
                        }    
                   }    
    }
    
}
