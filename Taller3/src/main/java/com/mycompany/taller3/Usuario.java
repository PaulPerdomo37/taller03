/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

/**
 *
 * @author CltControl
 */
public class Usuario {
    protected String usuario;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;

    public Usuario(String usuario, String contrasenia, String nombre, String apellido) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    

    protected boolean logIn(){
        return true;
    }
    
    protected boolean logOut(){
        return true;
    }
}
