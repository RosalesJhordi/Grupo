/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.opmatematicas;

// Iniciamos

import java.util.Scanner;

public class OpMatematicas {

    public static void main(String[] args) {
        //Agregamos bucle do-while
        do{
        // importamos la clase scanner
        Scanner a1 = new Scanner(System.in);
        
        //Creacion de Variables
        
        int n1,n2,suma,resta,mult,div;
        String op;
        
        // Priemra visualizacion
        System.out.print("INGRESE SU OPCION \n 1: SUMA \n 2: RESTA"
                + " \n 3: MULTIPLICACION \n 3: DIVISION \n Opcion: ");
        op = a1.next();
        //creacion del switch y case1-suma
        switch(op){
            //Suma
            case "1":
                System.out.print("\t suma \n ingresa el primer numero: ");
                n1 = a1.nextInt();
                System.out.print("ingresa el segundo numero: ");
                n2 = a1.nextInt();
                
                suma = n1+n2;
                
                System.out.println("la suma es: "+suma+"\n");
                break;
            // Resta
            case "2":
                System.out.println("\t Resta \n ingresa el primer numero: ");
                n1 = a1.nextInt();
                System.out.println("ingesa el segundo numero: ");
                n2 = a1.nextInt();
                
                resta = n1 - n2;
                
                System.out.println("La resta es : "+resta+"\n");
                break;
            //multiplicacion
            case "3":
                System.out.println("\t multiplicacion \n ingresa el primer numero: ");
                n1 = a1.nextInt();
                System.out.println("ingesa el segundo numero: ");
                n2 = a1.nextInt();
                
                mult = n1 * n2;
                
                System.out.println("La multiplicacion es : "+mult+"\n");
                break;
            //division
            case "4":
                System.out.println("\t Division \n ingresa el primer numero: ");
                n1 = a1.nextInt();
                System.out.println("ingesa el segundo numero: ");
                n2 = a1.nextInt();
                
                div = n1 / n2;
                
                System.out.println("La division es : "+div+"\n");
                break;
                
            default:
                System.out.println("\n OPCION NO VALIDA");
                break;
    }
    }while(10==10);
}
}
