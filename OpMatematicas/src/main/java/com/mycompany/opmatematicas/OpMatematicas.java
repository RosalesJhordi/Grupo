/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.opmatematicas;

// Iniciamos

import java.util.Scanner;

public class OpMatematicas {

    public static void main(String[] args) {
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
       
            case "1":
                System.out.print("\t suma \n ingresa el primer numero: ");
                n1 = a1.nextInt();
                System.out.print("ingresa el segundo numero: ");
                n2 = a1.nextInt();
                
                suma = n1+n2;
                
                System.out.println("la suma es: "+suma+"\n");
    }
    }
}
