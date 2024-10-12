/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author USER
 */
public class Caballo implements Animal {

    @Override
    public void dormir() {
        System.out.println("El caballo esta durmiendo");
    }

    @Override
    public void correr() {
        System.out.println("El caballo esta corriendo");
    }

    @Override
    public void alimentar() {
        System.out.println("El caballo esta alimentandose");
    }
    
    public void pastar(){
        System.out.println("El caballo esta pastando");
    }
}
