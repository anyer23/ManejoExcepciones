/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3ddivisionnueroe;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class ExceptionNumero {
    
    
   DivisionNumero divNum=new DivisionNumero();
        Scanner leer=new Scanner(System.in);
        
  public void ingresarNum(){
            try{
            System.out.println("Ingrese el primer numero ");
        String n1S = leer.nextLine();
        System.out.println("Ingrese el primer numero ");
        String n2S = leer.nextLine();

        int n1 = Integer.parseInt(n1S);
        int n2 = Integer.parseInt(n2S);

        System.out.println("La division es " + divNum.Dividir(n1, n2));
    }
    catch(NumberFormatException e ){
           System.out.println("Error al convertir lacadena a numero " + e.getMessage());
    }
  }

}