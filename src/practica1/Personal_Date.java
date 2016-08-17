/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

public class Personal_Date {
    private String nombre, apellido, edad, cedula, fecha, direccion, tel;
    private Scanner lector;
    
    public void Loading_Data(){
        lector =  new Scanner(System.in);
        System.out.println("Digite el nombre: ");
        nombre = lector.next();
        System.out.println("Digite el apellido: ");
        apellido = lector.next();
        System.out.println("Digite la cedula: ");
        cedula = lector.next();
        System.out.println("Digite el edad: ");
        edad = lector.next();
        System.out.println("Digite la fecha: ");
        fecha = lector.next();
        System.out.println("Digite la direccion: ");
        direccion = lector.next();
        System.out.println("Digite el telefono: ");
        tel = lector.next();
    }
    public void Data_Show(){
         System.out.println("Nombre: "+nombre+
                            " Apellido: "+apellido+
                            " Edad: "+edad+
                            " Cedula: "+cedula+
                            " Fecha: "+fecha+
                            " Direccion: "+direccion+
                            " Telefono: "+tel);
                    
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
}
