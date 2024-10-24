/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import com.mycompany.taller3.Administrador;

/**
 *
 * @author CltControl
 */
public class SoporteTecnico extends Usuario{

    public SoporteTecnico(String usuario, String contrasenia, String nombre, String apellido) {
        super(usuario, contrasenia, nombre, apellido);
    }
    
    public void brindarAsistencia(Usuario usuario){
    }

    public void resolverProblemaTecnico(Usuario usuario){
    }
    
    public void derivarProblemaDeGestion(Administrador administrador){
    }
    
}
