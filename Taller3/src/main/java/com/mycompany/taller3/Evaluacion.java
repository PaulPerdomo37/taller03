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
public class Evaluacion extends ActividadSumativa{
    private int limiteDeTiempo;

    public Evaluacion(String titulo, Date fechaDeEntraga, float puntajeMaximo, String contenido, float calificacion, String id) {
        super(titulo, fechaDeEntraga, puntajeMaximo, contenido, calificacion, id);
    }
    
}
