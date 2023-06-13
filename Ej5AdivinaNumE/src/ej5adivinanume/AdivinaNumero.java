/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5adivinanume;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author monte
 */
public class AdivinaNumero {
    Random random=new Random();
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    int numeroAdivina=random.nextInt(500)+1;//gererar un num
    int intentos=0, numeroIngresado;
    
    public void ingrasarNum(){
        System.out.println("Adivina el numero del 1 al 500");
        
        do{
            
            System.out.println("Ingrese un numero");
           try{
            numeroIngresado=leer.nextInt();
            
            intentos++;
                
                
            if (numeroIngresado<numeroAdivina) {
                System.out.println("El numero es mayor");
            }else if(numeroIngresado>numeroAdivina){
                System.out.println("El numero a divinar es menor");
            }else{
                System.out.println("Felicidaades adivinaste el numero en "+intentos +" intentos");
            }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa solo números.");
                leer.next(); // Limpia el valor inválido del escáner
                intentos++;
            }  
            
        }while (numeroIngresado!=numeroAdivina);
        leer.close();
    }
}
