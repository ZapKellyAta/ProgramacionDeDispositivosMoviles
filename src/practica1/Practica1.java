package practica1;

import static java.lang.Math.sqrt;
import java.util.Scanner;
//import com.sun.xml.internal.ws.api.pipe.NextAction;
import java.util.Calendar;
import java.util.GregorianCalendar;
import static practica1.Practica1.letra;

public class Practica1{
    static Scanner letra =  new Scanner(System.in);
    public static void main(String[] args) 
    {   
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el ejercicio que desea ver");
        int opcion = keyboard.nextInt();
        while(opcion>=1 && opcion<=20)
        {
            if(opcion == 1)
                Ejercicios.ejercicio1();
            else if(opcion == 2)
                Ejercicios.Ejercicio2();
            else if(opcion == 3)
                Ejercicios.ejercicio3();
            else if(opcion == 4)
                Ejercicios.Ejercicio4();
            else if(opcion == 5)
                Ejercicios.ejercicio5();
            else if(opcion == 6)
                Ejercicios.Ejercicio6();
            else if(opcion == 7)
                Ejercicios.ejercicio7();
            else if(opcion == 8)
                Ejercicios.Ejercicio8();
            else if(opcion == 9)
                Ejercicios.ejercicio9();
            else if(opcion == 10)
                Ejercicios.Ejercicio10();
            else if(opcion == 11)
                Ejercicios.ejercicio11();
            else if(opcion == 12)
                Ejercicios.Ejercicio12();
            else if(opcion == 13)
                Ejercicios.ejercicio13();
            else if(opcion == 14)
                Ejercicios.Ejercicio14();
            else if(opcion == 15)
                Ejercicios.ejercicio15();
            else if(opcion == 16)
                Ejercicios.Ejercicio16();
            //else if(opcion == 17)
            //   Ejercicios.Ejercicio17();
            //else if(opcion == 18)
            //    Ejercicios.ejercicio18();
            else if(opcion == 19)
                Ejercicios.ejercicio19();
        }
            //opcion = letra.nextInt();//opcion del menu
    }
}

class Ejercicios {
    static void Ejercicio2()
    {
        /* Escriba un algoritmo que permita calcular la hipotenusa de un triÃ¡ngulo rectÃ¡ngulo utilizando
        el teorema de PitÃ¡goras. */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Este programa calcula la hipotenusa de un triangulo rectangulo");
        int side1,side2;
        double sidel;
        System.out.println("Ingrese el primer cateto:");
        side1 = keyboard.nextInt();
        System.out.println("Ingrese el segundo cateto:");
        side2 = keyboard.nextInt();
        
        sidel = Math.pow(side1,2) + Math.pow(side2,2);
        System.out.println("La hiotenusa calculada es : " + " " + sidel);
    } 
    
    static void Ejercicio4()
    {
        /* Desarrollar un programa que calcule la nota definitiva de un estudiante en una asignatura, se
        sabe que durante el semestre acadÃ©mico se manejan tres notas con sus respectivos
        porcentajes asÃ­: seguimiento (50%), parcial I (25%) y parcial 2 (25%).
        */
        double seguimiento, parcial1,parcial2,notaFinal;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Este programa calcula la nota definitiva de un estudiante en un nsemestre");
        System.out.println("Ingrese la nota del seguimiento: ");
        seguimiento = keyboard.nextDouble()* 0.5;
        System.out.println("Ingrese la nota del primer parcial:");
        parcial1 = keyboard.nextDouble() * 0.25;
        System.out.println("Ingrese la nota del segundo parcial:");
        parcial2 = keyboard.nextDouble() * 0.25;
        
        notaFinal = seguimiento + parcial1 + parcial2;
        System.out.println("La nota final del estudiante es: " + " " + notaFinal);
    } 
    
    static void Ejercicio6()
    {
        /*En la U de A hay una mÃ¡quina dispensadora que tiene 4 productos etiquetados con los
        nÃºmeros 1, 2, 3 y 4, cada uno con un valor de $500, $800, $300 y $900, respectivamente.
        Defina un algoritmo que lea el nÃºmero de producto que ingresa el usuario y que le muestre
        su precio
         */ 
       Scanner keyboard = new Scanner(System.in);
       int producto;
       System.out.println("Este programa muestra el precio de 4 productos");
       System.out.println("Ingrese el producto escogido, las opciones son 1, 2,3,4");
       producto = keyboard.nextInt();
       switch(producto)
       {
           case 1:
               System.out.println("El valor del producto es $500");
           break;
           case 2:
               System.out.println("El valor del producto es $800");
           break;
           case 3:
               System.out.println("El valor del producto es $300");
           break;
           case 4:
               System.out.println("El valor del producto es $900");
           break;
           default:
               System.out.println("El producto ingresado no se vende en esta maquina, intente de nuevo");
           break;
       }
    }
    
    static void ejercicio7(){
        Calendar fecha =  new GregorianCalendar();
        int cont25=0,contfem=0,fuera=0,total=0;
        String opcion = "";
        do{
           System.out.println ("Digite aÃ±o de nacimiento");
           if ((fecha.get(Calendar.YEAR)-letra.nextInt()) <25)
               cont25++;
           System.out.println ("Digite Sexo 1:Femenino, 2:Masculino");
           if (letra.nextInt() == 1)
               contfem++;
           System.out.println ("Digite registro de carro 1:Medellin, 2:Otra ciudad ");
           if (letra.nextInt() == 2)
               fuera++;
           total++;
           System.out.println ("a) El porcentaje de conductores menores de 25 aÃ±os es: "+(cont25*100)/total);
           System.out.println ("b) El porcentaje de conductores del sexo femenino es: "+(contfem*100)/total);
           System.out.println ("c) El Porcentaje de conductores cuyos carros estÃ¡n registrados fuera de MedellÃ­n es: "+(fuera*100)/total);
           System.out.println ("d) El total de conductores es: "+total);
           System.out.println("Desea ingresar un nuevo conductor s/n \n");
           opcion = letra.next();
           
        }while(opcion.equals("s")); 
            
    }
    
    static void Ejercicio8()
    {
        /*
        Escribir un programa utilizando la estructura Switch, que reciba dos nÃºmeros de dos cifras,
        tome el primer nÃºmero digitado y dependiendo del valor del Ãºltimo digito haga:
        0: Diga cuÃ¡l es mayor 5: Calcule la divisiÃ³n
        1: Diga cuÃ¡l es menor 6: Diga si el primero es divisible por el segundo
        2: Calcule la suma 7: Diga si el segundo es divisible por el prime
        3: Calcule la resta 8: calcule la raÃ­z cuadrada del primer nÃºmero
        4: Calcule la multiplicaciÃ³n 9: Imprima en pantalla â€œQue punto tan fÃ¡cil
         parceâ€¦â€�
        */
        Scanner keyboard = new Scanner(System.in);
        int num1, num2,unidades;
        System.out.println("Ingrese el primer numero (numeros de dos cifras)");
        num1 = keyboard.nextInt();
        System.out.println("Ingrese el segundo numero (numeros de dos cifras)");
        num2 = keyboard.nextInt();
        //saco las unidades
        unidades =  num1%10;
        switch(unidades)
        {
            case 0:
                System.out.println("Opcion 0, diga cual es el mayor: ");
                if(num1>num2)
                    System.out.println("El numero 1" + " " + num1 + " es mayor");
                else if(num2>num1)
                    System.out.println("El numero 2" + " " + num2 + " es mayor");
                else
                    System.out.println("Los dos numeros son iguales");
            break;
            case 1:
                System.out.println("Opcion 1, diga cual es el menor: ");
                if(num1<num2)
                    System.out.println("El numero 1" + " " + num1 + " es menor");
                else if(num2<num1)
                    System.out.println("El numero 2" + " " + num2 + " es menor");
                else
                    System.out.println("Los dos numeros son iguales");
            break;
            case 2:
                System.out.println("Opcion 2 calcule la suma");
                int suma = num1 + num2;
                System.out.println("La suma de los dos numeros es: " + " " + suma);
            break;
            case 3:
                System.out.println("Opcion 3 calcule la resta");
                int resta = num1 - num2;
                System.out.println("La resta de los dos numeros es: " + " " + resta);
            break;
            case 4:
                System.out.println("Opcion 4 calcule la multiplicacion");
                int mult = num1 * num2;
                System.out.println("La multiplicacion de los dos numeros es: " + " " + mult);
            break; 
            case 5:
                System.out.println("Opcion 5 calcule la division");
                int div;
                if(num2 != 0)
                    div = num1/num2;
                else
                    div =  num2/num1;
                System.out.println("La division de los dos numeros es: " + " " + div);
            break;
            case 6:
                System.out.println("Opcion 6 diga si el primero es divisible por el segundo");
                if(num1%num2 == 0)
                    System.out.println("El primer numero"+" "+num1+"es divisible por el segundo"+" "+num2);
                else
                    System.out.println("El primer numero"+" "+num1+"NO es divisible por el segundo"+" "+num2);
            break;
            case 7:
                System.out.println("Opcion 7 diga si el segundo es divisible por el primero");
                if(num2%num1 == 0)
                    System.out.println("El segundo numero"+" "+num2+"es divisible por el primero"+" "+num1);
                else
                    System.out.println("El segundo numero"+" "+num2+"NO es divisible por el primero"+" "+num1);
            break;
            case 8:
                System.out.println("Opcion 8 diga la raiz cuadrada del primer numero");
                double raiz = sqrt(num1);
                System.out.println("La raiz cuadrada de "+" "+num1+"es: "+raiz);
            break;
            case 9:
                System.out.println("Opcion 9 Imprimir en pantalla");
                System.out.println("Que punto tan facil parce");
            break;
        }
    }
    
    static void Ejercicio10()
    {
        /*
        Leer un nÃºmero de dos dÃ­gitos y determinar si pertenece a la serie de Fibonacci. 
        */
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Ingrese el numero de dos cifras");
        int num = keyboard.nextInt();
        int fibo1=1, fibo2=1,i; 

        for(i=2;i<=num;i++)
        { 
            if(num == fibo2)
            { 
                System.out.print("El numero pertenece a la serie fibonacci"); 
                break; 
            } 
            else if(num < fibo2)
            { 
                System.out.print("el numero no pertenece a la serie fibonacci"); 
                break; 
            } 
            fibo2 = fibo1 + fibo2; 
            fibo1 = fibo2 - fibo1; 
        } 
        System.out.println(); 
    }
    
    static void Ejercicio12()
    {
        /*
        En un curso se practican 4 evaluaciones con los siguientes porcentajes: 25%, 20%, 25% y
        30%. Para cada estudiante se informa el cÃ³digo y las 4 notas. Hacer un programa que calcule
        la nota definitiva de cada estudiante, el promedio de notas definitivas del curso y el
        porcentaje de perdedores. Sugerencia: Asuma que el curso estÃ¡ compuesto por N
        estudiantes, usted es libre de asignar el valor de N, 50 o 10 por ejemplo
        */
        //Matriz para 5 estudiantes
        int n = 5,i,j,perdedores=0;
        double nota=0.0,notaFinal=0.0,promedioCurso=0.0;
        double [][] Notas = new double[n][4];
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Este programa trabaja con 5 estudiantes");
        System.out.println("Ingrese las 4 notas de cada estudiante");
        for (i=0;i<n;i++)
        {
            System.out.println("Ingrese las notas del estudiante numero"+" "+i);
            for(j=0;j<4;j++)
            {
                System.out.println("Ingrese la nota "+" "+j);
                if(j==0)
                    Notas[i][j]= keyboard.nextDouble()*0.25;
                else if(j==1)
                    Notas[i][j]= keyboard.nextDouble()*0.2;
                else if(j==2)
                    Notas[i][j]= keyboard.nextDouble()*0.25;
                else if(j==3)
                    Notas[i][j]= keyboard.nextDouble()*0.3;
                
            }
        }
        
        System.out.println("Las notas de cada estdiante son:");
        for (i=0;i<n;i++)
        {
            System.out.println("Las notas del estudiante numero"+" "+i+" "+"son:");
            for(j=0;j<4;j++)
            {
                System.out.println("Nota: "+" "+j+" = "+Notas[i][j]);
                notaFinal = notaFinal+Notas[i][j];        
            }
            System.out.println("La nota final del estudiante"+" "+ i+"es : "+notaFinal);
            promedioCurso = promedioCurso+notaFinal;
            if(notaFinal<3.0)
                perdedores++;
            notaFinal = 0.0;
        }
        System.out.println("La nota promedio del curso es:"+" "+promedioCurso/n);
        System.out.println("el numero de perdedores es:"+" "+perdedores);
    }
    
    static void ejercicio1(){
        int lado;
        Scanner letra = new Scanner(System.in);
        System.out.println ("Digite el lado del cubo ");
        lado = letra.nextInt();
        System.out.println ("El volumen del cubo es : "+Math.pow(lado, 3));
        System.out.println ("El area del cubo es : "+6*Math.pow(lado,2)+"\n");       
    }
   static void ejercicio3(){
        int lado;
        Scanner letra = new Scanner(System.in);
        System.out.println ("Digite el lado del Triangulo equilatero ");
        lado = letra.nextInt();
        System.out.println ("El perimetro del Triangulo equilatero es : "+3*lado);
        System.out.println ("El area del Triangulo equilatero es : "
                +(Math.sqrt(3)/4)*lado
        );   
        System.out.println ("La altura del Triangulo equilatero es : "
                +(Math.sqrt(3)/2)*lado+"\n"
        ); 
   }
    static void ejercicio5(){
        double acomulado = 0;
        Scanner letra = new Scanner(System.in);
        System.out.println ("Digite la nota de los Quices y seguimiento ");
        acomulado += (letra.nextDouble()*0.2);
        System.out.println ("Digite la nota de las Practicas de laboratorio ");
        acomulado += (letra.nextDouble()*0.3);
        System.out.println ("Digite la nota de las Exposiciones ");
        acomulado += (letra.nextDouble()*0.1);
        System.out.println ("Digite la nota del Proyecto 1 ");
        acomulado += (letra.nextDouble()*0.15);
        System.out.println ("Digite la nota del Proyecto final ");
        acomulado += (letra.nextDouble()*0.25);
        
        if(acomulado >= 0 && acomulado <= 1)
            System.out.println ("Estas en el lugar equivocado ");
        else if(acomulado > 1 && acomulado <= 2)
            System.out.println ("Remal ");
        else if (acomulado > 2 && acomulado <= 3)
            System.out.println ("Es posible recuperarse ");
        else if (acomulado > 3 && acomulado <= 4)
            System.out.println ("Normalito ");
        else if (acomulado > 4 && acomulado <= 4.5)
            System.out.println ("Muy Bien");
        else if (acomulado > 4.5 && acomulado <= 5)
            System.out.println ("Excelente estudiante \n");
    }
    
    static void ejercicio9(){
        for(int i=10;i>0;i--){
            System.out.println ("numero :"+i);
        }
    }
    static void ejercicio11(){
        int numero = 0; 
        long acomulado = 1;
        Scanner letra = new Scanner(System.in);
        System.out.println ("Digite numero para encontrarle el factorial");
        numero = letra.nextInt();
        for(int i = numero; i > 0; i--){
            acomulado *= i;
        }
        System.out.println ("El factorial del numero : "+numero+" es : "+acomulado+"\n");
    }
    
    static void ejercicio13(){
        System.out.println ("Digite numero limite de la sucesion Fibonacci ");
        Fibonacci fib = new Fibonacci(letra.nextInt());
        fib.calcular();
    }
    static void ejercicio15(){
        Cliente cliente =  new Cliente();
        int opcion;
        do{
        System.out.println("Digite una opcion: ");
        System.out.println("1. Ingresar Datos: ");
        System.out.println("2. Mostrar Datos: ");
        System.out.println("3. Actualizar Datos: ");
        System.out.println("4. Consignar: ");
        System.out.println("5. Retirar: ");
        System.out.println("6. Consultar Saldo: ");
        System.out.println("0. Salir: \n");
        opcion  =  letra.nextInt();
        
       
            switch (opcion)
            {
                case 1:cliente.Loading_Data();
                    break;
                case 2:cliente.Data_Show();
                    break;
                case 3:cliente.Actualizar_Datos();
                    break;
                case 4: cliente.Consignacion();
                    break;
                case 5:cliente.retirar();
                    break;
                case 6:cliente.consultar_saldo();
                    break;
            }
        }while(opcion!=0);    
    }
    static void ejercicio19(){
        Circulo c =  new Circulo();
        Cilindro ci =  new Cilindro();
       
        int opcion;
        
        do{
            
            System.out.println("Digite una opcion: ");
            System.out.println("1. Ingresar Datos Circulo: ");
            System.out.println("2. Ingresar Datos Cilindro: ");
            System.out.println("3. Ingresar Datos Cilindro hueco: ");
            System.out.println("4. Calcular Area y Longitud Circulo: ");
            System.out.println("5. Calcular Area y Volumen Cilindro: ");
            System.out.println("6. Calcular Longitud y Volumen Cilindro Hueco: ");
            System.out.println("0. Salir: \n");
            opcion  =  letra.nextInt();
            
            switch (opcion)
            {
                case 1:
                    System.out.println("Digite el radio del Circulo");
                    c.setRadio(letra.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite el radio del Cilindro");
                    ci.setRadio(letra.nextDouble());
                    System.out.println("Digite la altura del Cilindro");
                    ci.setAltura(letra.nextDouble());
                    break;
                case 3:
                    break;
                case 4: 
                    System.out.println("La longitud del circulo es :"+c.Longitud());
                    System.out.println("El area del circulo es :"+c.Area());
                    break;
                case 5:
                    System.out.println("El volumen del Cilindro es :"+ci.Volumen());
                    System.out.println("El area del Cilindro es :"+ci.Area());
                    break;
                case 6:
                    break;
            }
            
        }while(opcion != 0);
    }
    
    static void Ejercicio14()
    {
        Scanner keyboard = new Scanner(System.in);
        int opt = 0;
        Area a = new Area();
        do
        {
            System.out.println("Bienvenido, ingrese la opcion del area a calcular");
            System.out.println("1 para circulo");
            System.out.println("2 para triangulo");
            System.out.println("3 para cuadrado");
            System.out.println("4 para rectangulo"); 
            
            opt = keyboard.nextInt();
            switch (opt)
            {
                case 1:
                    System.out.println("Ingrese el radio del circulo");
                    int var = keyboard.nextInt();
                    a.setRadio(var);
                    System.out.println("El area del circulo es " + a.calcularCirculo());
                break;
                case 2:
                    System.out.println("Ingrese la base del triangulo");
                    double base = keyboard.nextDouble();
                    System.out.println("Ingrese la altura del triangulo");
                    double altura = keyboard.nextDouble();
                    a.setBase(base);
                    a.setAltura(altura);
                    System.out.println("El area del triangulo es: " + a.calcularTriangulo());
                break;
                case 3:
                    System.out.println("Ingrese el lado del cuadrado");
                    int lado = keyboard.nextInt();
                    a.setLado(lado);
                    System.out.println("El area del cuadrado es: " + a.calcularCuadrado());
                break;
                case 4:
                    System.out.println("Ingrese la base del rectangulo");
                    base = keyboard.nextInt();
                    System.out.println("Ingrese la altura del rectangulo");
                    altura = keyboard.nextInt();
                    a.setBase(base);
                    a.setAltura(altura);
                    System.out.println("El area del rectangulo es: " + a.calcularRectangulo());
                break;
            }
        }while(opt>=1 && opt<=4);
    }
    
    static void Ejercicio16()
    {
        Publicacion pu = new Publicacion();
        Scanner keyboard = new Scanner(System.in);
        int opt=0;
        do
        {
           System.out.println("Ingrese la opcion que desea ingresar");
           System.out.println("1 Ingresar datos de la publicacion");
           System.out.println("2 mostrar datos de la publicacion");
           opt = keyboard.nextInt();
           switch (opt)
           {
               case 1:
                   System.out.println("Ingrese el titulo de la publicacion(Sin espacios)");
                   String titulo = keyboard.next();
                   pu.setTitulo(titulo);
                   System.out.println("Ingrese el precio de la publicacion(Sin espacios)");
                   double precio = keyboard.nextDouble();
                   pu.setPrecio(precio);
                   System.out.println("La publicacion es un libro?");
                   System.out.println("1 SI");
                   System.out.println("2 NO, es un disco");
                   int opt2 = keyboard.nextInt();
                   if(opt2 ==1)
                   {
                       pu.IngresarInfo();
                       pu.setOpt2(1);
                   }
                   else if(opt2 == 2)
                   {
                       pu.IngresarInfoDisco();
                       pu.setOpt2(2);
                   }
                       
               break;
               case 2:
                   pu.MostrarDatos();
               break;
           }
        }while(opt!=0);
    }
    
    static void Ejercicio17()
    {
        Ventas ven = new Ventas();
        Scanner keyboard = new Scanner(System.in);
        int opt=0;
        do
        {
           System.out.println("Ingrese la opcion que desea ingresar");
           System.out.println("1 Ingresar datos de la publicacion");
           System.out.println("2 mostrar datos de la publicacion");
           opt = keyboard.nextInt();
           switch (opt)
           {
               case 1:
                   
               break;
               case 2:
                   ven.MostrarDatos();
               break;
           }
        }while(opt!=0);
    }
}