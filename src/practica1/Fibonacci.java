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
public class Fibonacci {
    //sucecion fibonacci
    
    int num1=0;
    int num2=1;
    int temp;
    int limite;
    
    Fibonacci(int a){
        this.limite = a;
    }
    public void calcular(){
       System.out.println("La Sucecion es :\n");
       while(num1+num2 <= limite){
           temp=num1;
           num1 = num2;
           num2 = temp+num1;
           System.out.print(num2+" ");
       }
    }
}
