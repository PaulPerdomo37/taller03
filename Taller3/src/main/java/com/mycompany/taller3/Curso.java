/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.List;

/**
 *
 * @author CltControl
 */
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor profesor;
    private List<Estudiante> listaDeEstudiantes;
    private List<Foro> foros;
    private List<ActividadSumativa> actividadesDelCurso;

    public Curso(String id, String nombre, boolean estadoDisponible, Profesor profesor, List<Estudiante> listaDeEstudiantes) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.profesor = profesor;
    }
    
    public void reguistrarEstudiante(Estudiante estudiante){
        listaDeEstudiantes.add(estudiante);
    }
    
    //se usuaria up casting  para dividir las tareas de las evaluacion
    public void agregarActividadSumativa(ActividadSumativa actividadSumativa){
        actividadesDelCurso.add(actividadSumativa);
    }
}
