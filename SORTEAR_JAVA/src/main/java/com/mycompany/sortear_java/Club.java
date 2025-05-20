/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortear_java;

/**
 *
 * @author Silva
 */
public class Club {

    private String nombre;
    private PaisSudamericano pais;

    public Club(String nombre, PaisSudamericano pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return nombre + " de " + pais;
    }
}
