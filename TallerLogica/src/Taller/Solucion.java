/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Solucion {
     static Scanner sc = new Scanner(System.in);
    public static void main(String[]args){
        //primerPunto();
         //segundoPunto(0 ,0);
         tercerPunto();
    }
    static public double primerPunto(){
        double a= 3+(8*5)-(6/3);


        System.out.println("Resultado "+a);
        //ejercicio2
        double b= (2.5*2*3)-(4/2)+8f;
        System.out.println("resultado 2: " + b);
        //ejercicio 3

        double c= 2*(6-2.5)/3;
        System.out.println("Resultado 3: " + c);

        //ejercicio 4
        boolean d = 25>18;
        System.out.println("Resultado 4: "+ d);

        //ejercicio 5
        double num1 = 3+(2.5*4)/3 ;
        double num2= (4*5.2)-3.8;
        boolean res = num1 != num2;
        System.out.println("Si los valores son diferentes dice true: " +res);

        //ejercicio 6 (8.5/3.2+6.5-2.3*5/6 >= 15.8) && (21.4<81/4+2)
        double pri = (8.5/3.2+6.5-2.3*5/6 ) ;
        double h = 15.8;
        boolean j = pri >= h;
        double seg = 81/4+2;
        boolean cop= 21.4<seg;
        boolean and = j && cop;
        System.out.println("Si las dos son verdaderas dira true " +and+ " de lo contrario dira false");

        return a;
    }
    static public double segundoPunto(double a, double b ){
        System.out.println("");
        System.out.println("Ingrese el lado1 del rectangulo:" );
        double lado1 = sc.nextDouble();
        System.out.println("Ingrese el lado 2 rectangulo: ");
        double lado2= sc.nextDouble();
        double perimetro = lado1+lado2+lado1+lado2;
        double area = lado1*lado2;
        double result = area, petimetro;
        System.out.println("El area del rectangulo es: " +area+"cm2" +" y el perimetro es: " +perimetro+"cm" );

return result;


    }
    static public double tercerPunto (){
        System.out.println("Ingrese el valor del primer mes");
        double mes1 = sc.nextDouble();
        System.out.println("Ingrese el valor del segundo mes");
        double mes2 = sc.nextDouble();
        System.out.println("Ingrese el valor del tercero mes");
        double mes3 = sc.nextDouble();
        System.out.println("Ingrese el valor del cuarto mes");
        double mes4 = sc.nextDouble();
        System.out.println("Ingrese el valor del quinto mes");
        double mes5 = sc.nextDouble();
        System.out.println("Ingrese el valor del sexto mes");
        double mes6 = sc.nextDouble();
        System.out.println("Ingrese el valor del septimo  mes");
        double mes7 = sc.nextDouble();
        System.out.println("Ingrese el valor del octavo mes");
        double mes8 = sc.nextDouble();
        System.out.println("Ingrese el valor del noveno mes");
        double mes9 = sc.nextDouble();
        System.out.println("Ingrese el valor del decimo mes");
        double mes10 = sc.nextDouble();
        System.out.println("Ingrese el valor del undecimo mes");
        double mes11 = sc.nextDouble();
        System.out.println("Ingrese el valor del doceavo mes");
        double mes12 = sc.nextDouble();
        double result= (mes1+mes2+mes3+mes4+mes5+mes6+mes7+mes8+mes9+mes10+mes11+mes12)/12;
        System.out.println("Promedio anual es de:"+result+"Tn" );
        return result;
    }

}
