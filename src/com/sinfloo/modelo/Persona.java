
package com.sinfloo.modelo;

public class Persona {
    int id;
    String numExpediente;
    String numJuez;
    String materia;
    String tipoCaso;
    String demandante;
    String demandado;
    String fechaInicio;

    public Persona() {
    }

    public Persona(int id, String numExpediente, String numJuez, String materia, String tipoCaso,
                   String demandante, String demandado, String fechaInicio) {
        this.id = id;
        this.numExpediente = numExpediente;
        this.numJuez = numJuez;
        this.materia  = materia;
        this.tipoCaso = tipoCaso;
        this.demandante = demandante;
        this.demandado = demandado;
        this.fechaInicio = fechaInicio;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumExpediente() {
        return numExpediente;
    }

    public void setNumExpediente(String numExpediente) {
        this.numExpediente = numExpediente;
    }

    public String getNumJuez() {
        return numJuez;
    }

    public void setNumJuez(String numJuez) {
        this.numJuez = numJuez;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTipoCaso() {
        return tipoCaso;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public String getDemandante() {
        return demandante;
    }

    public void setDemandante(String demandante) {
        this.demandante = demandante;
    }

    public String getDemandado() {
        return demandado;
    }

    public void setDemandado(String demandado) {
        this.demandado = demandado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    
    
    
}
