/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author USER
 */
public class semana9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Leon leon=new Leon();
        Caballo caballo=new Caballo();  
        System.out.println("Escena de caza:");
        
        leon.dormir();
        caballo.dormir();
        caballo.pastar();
        caballo.alimentar();
        leon.cazar();
        leon.correr();
        caballo.correr();
        leon.alimentar(); 
    }
}      
    