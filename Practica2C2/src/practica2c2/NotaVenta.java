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
public abstract class NotaVenta {//cuando se coloca un metodo abstracto la clase tiene que ser abstracta
    protected int numeroNota;
    protected String fecha;
    protected String concepto;
    protected ProductoPerecedero producto;
    protected float cantidad;
    protected int tipoPago;
    
    public NotaVenta()
    {
        this.numeroNota=01;
        this.fecha="";
        this.concepto="";
        this.producto=new ProductoPerecedero ();
        this.cantidad=0.0F;
        this.tipoPago=01;
    }
    public NotaVenta(int numeroNota,String fecha,String concepto,ProductoPerecedero producto,
            float cantidad, int tipoPago)
    {
        this.numeroNota=numeroNota;
        this.fecha=fecha;
        this.concepto=concepto;
        this.producto=producto;
        this.cantidad=cantidad;
        this.tipoPago=tipoPago;
    }

    /**
     * @return the numeroNota
     */
    public int getNumeroNota() {
        return numeroNota;
    }

    /**
     * @param numeroNota the numeroNota to set
     */
    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the cantidad
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the tipoPago
     */
    public int getTipoPago() {
        return tipoPago;
    }

    /**
     * @param tipoPago the tipoPago to set
     */
    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    /**
     * @return the producto
     */
    public ProductoPerecedero getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(ProductoPerecedero producto) {
        this.producto = producto;
    }
    
    public abstract float calcularPago(); //se pone el abstract por el simple hecho de ser un metodo abstracto
}
