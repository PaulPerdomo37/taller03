/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

/**
 *
 * @author CltControl
 */
public class Foro {
    private String id;
    private String tematica;
    private int numeroDeComentarios;

    public Foro(String id, String tematica, int numeroDeComentarios) {
        this.id = id;
        this.tematica = tematica;
        this.numeroDeComentarios = numeroDeComentarios;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getNumeroDeComentarios() {
        return numeroDeComentarios;
    }

    public void setNumeroDeComentarios(int numeroDeComentarios) {
        this.numeroDeComentarios = numeroDeComentarios;
    }
    
}
