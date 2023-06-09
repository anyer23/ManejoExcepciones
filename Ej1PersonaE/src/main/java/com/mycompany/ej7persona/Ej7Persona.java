/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ej7persona;

/**
 *
 * @author monte
 */
public class Ej7Persona {

    public static void main(String[] args) {

        Exception_Persona exPe = new Exception_Persona();
//        try {

        //  Persona persona1 = new Persona();
        // persona1.crearPersona(persona1);
        Persona persona1 = new Persona("juan", 10, 'H', 66, 1.67);

        //Persona persona2 = new Persona();
        // persona2.crearPersona(persona1);
        Persona persona2 = new Persona("julian", null, 'H', 80, 1.55);
        // Persona persona3 = new Persona();
        // persona3.crearPersona(persona1);
        Persona persona3 = new Persona("ana", 36, 'M', 80, 1.56);
        //Persona persona4 = new Persona();
        // persona4.crearPersona(persona1);
        Persona persona4 = new Persona("maria", null, 'O', 96, 1.20);

        Persona[] personas = {persona1, persona2, persona3, persona4};

        for (Persona persona : personas) {

            System.out.println("La persona  " + persona.getNombre() + " tiene un peso de " + persona.getPeso() + " kg");
            System.out.println("Su edad es " + exPe.esMayorDeEdad());
//try{
            double imc = persona.calcularIMC();
            if (imc < -1) {

                System.out.println("Esta por debajo de su peso ideal");
            }
            if (imc > 0) {

                System.out.println("Esta en su peso ideal");
            }
            if (imc <= 0) {
                System.out.println("Esta en sobre peso ");
            }
//}catch (NullPointerException e) {
//    System.out.println("ddf"+e.getLocalizedMessage());
//                System.out.println("Se produjo una NullPointerException: desde  " + e.getMessage());
// }

        }
//        } catch (NullPointerException e) {
//            System.out.println("Se produjo una NullPointerException: " + e.getMessage());
//            System.out.println(e.fillInStackTrace());
//        }

    }

}
