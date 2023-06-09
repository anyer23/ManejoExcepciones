/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej7persona;

import com.sun.source.tree.TryTree;

/**
 *
 * @author monte
 */
public class Exception_Persona {

    public double esMayorDeEdad() {
        Persona per = new Persona();
        try {
            if (per.getEdad() == null) {

                //       
                throw new NullPointerException("Error de edad");

            }
            if (per.getEdad() < 18) {
                System.out.println("Es menor de edad");

            } else {
                System.out.println("Es mayor de edad ");
            }
            return per.getEdad();
            
        } catch (NullPointerException e) {
            System.out.println("Se produjo una NullPointerException: " + e.getMessage() + " esta en null");

            System.out.println(e.fillInStackTrace());
        }

        return 0;
    }
}
