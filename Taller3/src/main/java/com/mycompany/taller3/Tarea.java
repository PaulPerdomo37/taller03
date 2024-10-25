/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Tarea extends ActividadSumativa{
    private Date fechaDePublicacion;

    public Tarea(String titulo, Date fechaDeEntraga, float puntajeMaximo, String contenido, float calificacion, String id) {
        super(titulo, fechaDeEntraga, puntajeMaximo, contenido, calificacion, id);
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
}
