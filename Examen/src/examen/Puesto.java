/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author PC08
 */
public class Puesto {
    protected int numPuesto;
    protected String descripcion;
    protected String funciones;
    protected int nivelAcademico;
    protected int tipoPuesto;
    
    public Puesto()
    {
        this.numPuesto=01;
        this.descripcion="default";
        this.funciones="default";
        this.nivelAcademico=01;
        this.tipoPuesto=01;
    }        
    
    public Puesto(int numPuesto,String descripcion,String funciones,
                  int nivelAcademico,int tipoPuesto)
    {
        this.numPuesto=numPuesto;
        this.descripcion=descripcion;
        this.nivelAcademico=nivelAcademico;
        this.funciones=funciones;
        this.tipoPuesto=tipoPuesto;
    }

    /**
     * @return the numPuesto
     */
    public int getNumPuesto() {
        return numPuesto;
    }

    /**
     * @param numPuesto the numPuesto to set
     */
    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the funciones
     */
    public String getFunciones() {
        return funciones;
    }

    /**
     * @param funciones the funciones to set
     */
    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    /**
     * @return the nivelAcademico
     */
    public int getNivelAcademico() {
        return nivelAcademico;
    }

    /**
     * @param nivelAcademico the nivelAcademico to set
     */
    public void setNivelAcademico(int nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    /**
     * @return the tipoPuesto
     */
    public int getTipoPuesto() {
        return tipoPuesto;
    }

    /**
     * @param tipoPuesto the tipoPuesto to set
     */
    public void setTipoPuesto(int tipoPuesto) {
        this.tipoPuesto = tipoPuesto;
    }
           
}
