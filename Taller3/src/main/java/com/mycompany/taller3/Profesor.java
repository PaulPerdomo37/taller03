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
public class Profesor extends PersonalAcademico{
    
    private List<Curso> cursosACargo;

    public Profesor(List<Curso> cursosACargo, String usuario, String contrasenia, String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
        this.cursosACargo = cursosACargo;
    }
    
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
    }
    
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa){
    }
    
    public boolean aceptarInscripcion(Curso curso, String usuarioEstudiante){
        return true;
    }
    
    public void crearNuevoForo(Foro foro){
    }
    
    public void darRetroalimentacionAEstudiante(String contenido, String nombreUsuario){
    }

    public List<Curso> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(List<Curso> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }
    
    
    //se usuaria up casting  para dividir las tareas de las evaluacion
    public boolean agregarActividadSumativa(String contenido, Curso curso){
        if(contenido != null && curso!= null){
            ActividadSumativa as=null;
            curso.agregarActividadSumativa(as);
            return true;
        }else{
            return false;
        }
    }
}
