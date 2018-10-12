/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2c2;

/**
 *
 * @author PC21
 */
public class Factura extends NotaVenta{
    
    protected String rfc;
    protected String nombreCliente;
    protected String domicilio;
    protected String fechaF;
    protected int iva;
    
    public Factura()
    {
        this.rfc="";
        this.nombreCliente="";
        this.domicilio="";
        this.fechaF="";
        this.iva=01;
    }
    
    public Factura(int numeroNota,String fecha,String concepto,ProductoPerecedero producto,float cantidad,int tipoPago,
    String rfc,String nombreCliente,String domicilio,String fechaF,int iva)
    {
        super(numeroNota,fecha,concepto,producto,cantidad,tipoPago);
        this.rfc=rfc;
        this.nombreCliente=nombreCliente;
        this.domicilio=domicilio;
        this.fechaF=fechaF;
        this.iva=iva;   
    }
    
    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the fechaF
     */
    public String getFechaF() {
        return fechaF;
    }

    /**
     * @param fechaF the fechaF to set
     */
    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }

    /**
     * @return the iva
     */
    public int getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(int iva) {
        this.iva = iva;
    }
    
    @Override
    public float calcularPago() {
        float subtotal=0.0F;
        subtotal=cantidad*producto.calcularPrecioUnitario();
        return subtotal;
    }
    
    public float calcularImpuesto()
    {
        float impuesto=0.0F;
        impuesto=(calcularPago()*iva)/100;
        return impuesto;
    }
    
    public float calcularTotal()
    {
        float total=0.0F;
        total=calcularPago()+calcularImpuesto();
        return total;
    }
}
