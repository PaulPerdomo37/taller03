/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import com.mycompany.taller3.ActividadSumativa;
import com.mycompany.taller3.Curso;

/**
 *
 * @author CltControl
 */
public class Administrador extends Usuario{

    public Administrador(String usuario, String contrasenia, String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
    }
    
    
    public void crearUsuarioConRol(String usuario,String contrasenia){
    }
    
    public void asignarPermiso(String usuario){
    }
    
    public void actualizarSoftware(){
    }
    
    public void asignarResponsable(Curso curso, ActividadSumativa actividadSumativa){
    }
}
