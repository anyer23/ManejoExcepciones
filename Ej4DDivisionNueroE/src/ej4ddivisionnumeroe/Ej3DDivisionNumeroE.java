/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4ddivisionnumeroe;

import java.util.Scanner;

/**
 *
 * @author monte
 */
public class Ej3DDivisionNumeroE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DivisionNumero divNu=new DivisionNumero();
        
        try {
            divNu.Dividir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
        
        
        
    }
    
}
