/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.List;

/**
 *
 * @author HerreraNieto
 */
public class Estudiante extends PersonalAcademico{
    private List<Curso> listadoDeCursos;

    public Estudiante(List<Curso> listadoDeCursos, String usuario, String contrasenia, String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
        this.listadoDeCursos = listadoDeCursos;
    }
    
    public List<Curso> cursosDisponibles(){
        return null;
    }
    
    public void solicitarInscripcionCurso(Curso curso){
        
        boolean respuesta = true;
        if(respuesta==true){
            listadoDeCursos.add(curso);
            curso.reguistrarEstudiante(this);
        }
    }
    
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
    }

    public List<Curso> getListadoDeCursos() {
        return listadoDeCursos;
    }

    public void setListadoDeCursos(List<Curso> listadoDeCursos) {
        this.listadoDeCursos = listadoDeCursos;
    }
    
    
}
