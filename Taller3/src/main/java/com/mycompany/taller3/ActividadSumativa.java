/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.Date;

/**
 *
 * @author CltControl
 */
public class ActividadSumativa {
    protected String titulo;
    protected Date fechaDeEntraga;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion;
    protected String id;

    public ActividadSumativa(String titulo, Date fechaDeEntraga, float puntajeMaximo, String contenido, float calificacion, String id) {
        this.titulo = titulo;
        this.fechaDeEntraga = fechaDeEntraga;
        this.puntajeMaximo = puntajeMaximo;
        this.contenido = contenido;
        this.calificacion = calificacion;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
}

    public Date getFechaDeEntraga() {
        return fechaDeEntraga;
    }

    public float getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public String getContenido() {
        return contenido;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public String getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaDeEntraga(Date fechaDeEntraga) {
        this.fechaDeEntraga = fechaDeEntraga;
    }

    public void setPuntajeMaximo(float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public void setId(String id) {
        this.id = id;
    }
}
