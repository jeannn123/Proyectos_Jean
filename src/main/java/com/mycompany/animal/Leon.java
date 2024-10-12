/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author USER
 */
public class Leon implements Animal{

    @Override
    public void dormir() {
        System.out.println("El leon esta durmiendo");
    }

    @Override
    public void correr() {
        System.out.println("El leon esta corriendo");
    }

    @Override
    public void alimentar() {
        System.out.println("El leon esta durmiendo");
    }
    public void cazar(){
        System.out.println("El leon esta cazando");
    }
}
