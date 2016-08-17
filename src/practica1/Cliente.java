/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author practi08
 */
public class Cliente extends Personal_Date{
    private static double saldo;
    private Scanner lector; 
    
    public void Actualizar_Datos(){
        lector =  new Scanner(System.in);
        System.out.println("Digite el direccion: ");
        this.setDireccion(lector.next());
        System.out.println("Digite el telefono: ");
        this.setTel(lector.next());
     }

    public double getSaldo() {
        return saldo;
    }

    public  void setSaldo(double saldo) {
        Cliente.saldo = saldo;
    }
    
    public void Consignacion(){
        System.out.println("Digite el valor a consignar: ");
        setSaldo(lector.nextDouble()+getSaldo());
    }
    
    public void retirar(){
        double saldo;
        System.out.println("Digite el valor a retirar: ");
        saldo = lector.nextDouble();
        if (saldo > getSaldo())
            System.out.println("El monto supera el actual, cancelado: \n");
        else
            setSaldo(getSaldo()-saldo);
    }
    
    public void consultar_saldo(){
        System.out.println("El saldo actual es : "+getSaldo()+"\n");  
    }
}
