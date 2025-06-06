/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortear_java;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
/**
 *
 * @author Silva
 */
public class Sorteador<T> {

    private ArrayList<T> elementos;
    private Random random;

    /**
     * Construye un nuevo sorteador de elementos.
     */
    public Sorteador() {
        this.elementos = new ArrayList<>();
        this.random = new Random();
    }

    /**
     * Agrega un elemento a este sorteador.
     *
     * @param elemento El elemento a agregar.
     */
    public void add(T elemento) {
        elementos.add(elemento);
    }

    /**
     * Retorna un elemento de este sorteador (sin quitarlo) de manera aleatoria.
     *
     * @return un elemento de este sorteador (sin quitarlo) de manera aleatoria.
     * @throws NoSuchElementException Si ya no quedan elementos en este
     * sorteador.
     */
    public T get() {
        checkEmptyness();
        return elementos.get(rnd());
    }

    /**
     * Retorna un elemento de este sorteador (quitándolo) de manera aleatoria.
     *
     * @return un elemento de este sorteador (quitándolo) de manera aleatoria.
     * @throws NoSuchElementException Si ya no quedan elementos en este
     * sorteador.
     */
    public T remove() {
        checkEmptyness();
        return elementos.remove(rnd());
    }

    /**
     * Retorna un entero aleatorio entre 0 (inclusive) y la cantidad de elementos del sorteador (sin incluir)
     *
     * @return un entero aleatorio entre 0 (inclusive) y la cantidad de elementos del sorteador (sin incluir)
     */
    private int rnd() {
        return random.nextInt(elementos.size());
    }

    /**
     * Chequea que el sorteador no esté vacío, de lo contrario, lanza una excepción
     * @throws NoSuchElementException Si ya no quedan elementos en este
     * sorteador.
     */
    private void checkEmptyness() {
        if (isEmpty()) {
            throw new NoSuchElementException("No hay más elementos en el sorteador");
        }
    }

    /**
     * Retorna <code>true</code> si no hay elementos en este sorteador.
     *
     * @return <code>true</code> si no hay elementos en este sorteador.
     */
    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}
