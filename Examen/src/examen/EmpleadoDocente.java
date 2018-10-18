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
public class  EmpleadoDocente extends Empleado {
    private int numMaterias;
    private float pagoH;
    
    public EmpleadoDocente()
    {
        this.numMaterias=01;
        this.pagoH=0.0F;
    }
    
    public EmpleadoDocente(int numEmpleado,String nombre,Puesto puesto,
            String fechaIngreso,int numMaterias,float pagoH)
    {
        super(numEmpleado,nombre,puesto,fechaIngreso);
        this.numMaterias=numMaterias;
        this.pagoH=pagoH;
    }
    
    
    /**
     * @return the numMaterias
     */
    public int getNumMaterias() {
        return numMaterias;
    }

    /**
     * @param numMaterias the numMaterias to set
     */
    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }

    /**
     * @return the pagoH
     */
    public float getPagoH() {
        return pagoH;
    }

    /**
     * @param pagoH the pagoH to set
     */
    public void setPagoH(float pagoH) {
        this.pagoH = pagoH;
    }
    public float calcularPerseccion()
    {
        float perseccion=0;
        if(numMaterias>3)
        {
           perseccion=calcularPago()*0.30F; 
        }
        else
        {
           perseccion=calcularPago()*0.10F;
        }
        return perseccion;
    }
    @Override
    public float calcularPago() {
        float pago=0;
        if(puesto.getTipoPuesto()==1)
        {
            pago=pagoH*numMaterias;
            pago=pago+(pago*0.18F);
        }
        return pago;
    }

    @Override
    public float calcularImpuesto() {
       float impuesto=0;
       if(puesto.getTipoPuesto()>2)
       {
           impuesto=calcularPago()*0.18F;//en caso de haber mas puestos de haria esto
       }
       else
       {
           impuesto=calcularPago()*0.16F;
       }
       return impuesto;
    }

}
