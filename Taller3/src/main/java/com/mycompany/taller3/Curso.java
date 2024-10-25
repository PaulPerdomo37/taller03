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
    private List<Estudiante> listaDeEstudiantesInscritos;
    private List<Estudiante> listaDeEstudiantesEnEspera;
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

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Estudiante> getListaDeEstudiantes() {
        return listaDeEstudiantes;
    }

    public List<Foro> getForos() {
        return foros;
    }

    public List<ActividadSumativa> getActividadesDelCurso() {
        return actividadesDelCurso;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setListaDeEstudiantes(List<Estudiante> listaDeEstudiantes) {
        this.listaDeEstudiantes = listaDeEstudiantes;
    }

    public void setForos(List<Foro> foros) {
        this.foros = foros;
    }

    public void setActividadesDelCurso(List<ActividadSumativa> actividadesDelCurso) {
        this.actividadesDelCurso = actividadesDelCurso;
    }
    
}
