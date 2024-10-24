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
public class PersonalAcademico extends Usuario{
    
    private List<Incidente> incidentes;
    
    public PersonalAcademico(String usuario, String contrasenia, String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
    }
    
    public void reportarError(String email , String contenido){
    }
    
    public void solicitarAsesoramientoDelSistema(String email, String contenido){
    }
    
    public void comentarForo(Foro foro, String comentario){
    }
    
    public void agregarIncidente(Incidente incidente) {
        incidentes.add(incidente);
        System.out.println("Incidente añadido al soporte técnico.");
    }
    
    public List<Incidente> getIncidentes() {
        return incidentes;
    }
}
