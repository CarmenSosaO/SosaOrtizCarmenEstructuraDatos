/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author PRUEBAS
 */
public class Empleado {
    //atributos
    private int num_Trabajador;
    private String nombres;
    private String ap_Paterno;
    private String ap_Materno;
    private int horas_Extras;
    private int sueldo_Base;
    private int anio_Ingreso;
    
    //constructores
    
    public Empleado(int nt, String nom, String pat, String mat, int ht, int suel, int anio){
       
            this.num_Trabajador  = nt;
            this.nombres = nom;
            this.ap_Paterno = pat;
            this.ap_Materno = mat;
            this.horas_Extras = ht;
            this.sueldo_Base = suel;
            this.anio_Ingreso = anio;
            
    
          






    }

    public int getNum_Trabajador() {
        return num_Trabajador;
    }

    public void setNum_Trabajador(int num_Trabajador) {
        this.num_Trabajador = num_Trabajador;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAp_Paterno() {
        return ap_Paterno;
    }

    public void setAp_Paterno(String ap_Paterno) {
        this.ap_Paterno = ap_Paterno;
    }

    public String getAp_Materno() {
        return ap_Materno;
    }

    public void setAp_Materno(String ap_Materno) {
        this.ap_Materno = ap_Materno;
    }

    public int getHoras_Extras() {
        return horas_Extras;
    }

    public void setHoras_Extras(int horas_Extras) {
        this.horas_Extras = horas_Extras;
    }

    public int getSueldo_Base() {
        return sueldo_Base;
    }

    public void setSueldo_Base(int sueldo_Base) {
        this.sueldo_Base = sueldo_Base;
    }

    public int getAnio_Ingreso() {
        return anio_Ingreso;
    }

    public void setAnio_Ingreso(int anio_Ingreso) {
        this.anio_Ingreso = anio_Ingreso;
    }
    
 

    
    
    
    
    
    
}
