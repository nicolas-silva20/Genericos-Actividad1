/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortear_java;

/**
 *
 * @author Silva
 */
public enum PaisSudamericano {
    ARGENTINA, BRASIL, URUGUAY, PARAGUAY, CHILE, BOLIVIA,
    ECUADOR, PERU, COLOMBIA, VENEZUELA, GUYANA, SURINAME;

    private PaisSudamericano() {
    } // Evita que se creen instancias de PaisSudamericano

    @Override
    public String toString() {
        // Retorna el nombre capitalizado. "ARGENTINA" --> "Argentina"
        return this.name().substring(0, 1).toUpperCase() + this.name().substring(1).toLowerCase();
    }
}