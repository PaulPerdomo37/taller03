/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller3;

import java.util.Date;
import java.util.List;

/**
 *
 * @author HerreraNieto
 */
public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
    private PersonalAcademico beneficiario;

    public Incidente(int id, Date fecha_reportado, String estado, String titulo, String descripcion, String tipo, PersonalAcademico beneficiario) {
        this.id = id;
        this.fecha_reportado = fecha_reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.beneficiario = beneficiario;
    }
    
    public PersonalAcademico getBeneficiario() { return beneficiario; }
}
