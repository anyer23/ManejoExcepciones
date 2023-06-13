/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4ddivisionnumeroe;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class DivisionNumero {
    Scanner leer=new Scanner(System.in);
    String numero;
   int n1,n2;
     
    public void Dividir() throws Exception{
        
        System.out.println("Ingrese un numero");
        verificarEntrada();
        n1=verificarConversion();
        System.out.println("Ingrese otro numero");
        verificarEntrada();
        n1=verificarConversion();
        
        System.out.println(verificarDivision(n1, n2));
        
      
        
    }
    
    public void verificarEntrada() throws Exception{
        try {
            numero=leer.next();
        } catch (Exception e) {
            throw new Exception("Error de entrada");
        }
    }
    
    public  int verificarConversion() throws Exception{
        try {
            return Integer.parseInt(numero); 
        } catch (Exception e) {
            throw new Exception("Error de conversion, debe de ingresar un entero");
        }
    }
    
    public double verificarDivision(int num,int num2) throws Exception{
        try {
            if (num2==0 || num==0 ) {
                throw  new Exception("Error al dividir por 0");
            }
            return (double)num/num2;
        } catch (Exception e) {
            throw new Exception("Error de division");
        }
    }
    
}
