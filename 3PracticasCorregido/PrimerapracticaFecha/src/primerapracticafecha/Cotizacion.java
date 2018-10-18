/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerapracticafecha;

/**
 *
 * @author Administrador
 */
    public class Cotizacion {
    private int numCotizacion;
    private String descripcion;
    private int precio;
    private int pagoInicial;
    private int plazo;
    
    public Cotizacion()
    {
     this.numCotizacion=01;
     this.descripcion="Default";
     this.precio=00;
     this.pagoInicial=00;
     this.plazo=36;
    }
    
    public Cotizacion(int numCotizacion,String descripcion, int precio, int pagoInicial, int plazo)
    {
        this.numCotizacion=numCotizacion;
        this.descripcion=descripcion;
        this.precio=precio;
        this.pagoInicial=pagoInicial;
        this.plazo=plazo;
    }
    
    public Cotizacion(Cotizacion otro)
    {
        this.numCotizacion=otro.numCotizacion;
        this.descripcion=otro.descripcion;
        this.precio=otro.precio;
        this.pagoInicial=otro.pagoInicial;
        this.plazo=otro.plazo;
    }
    /**
     * @return the numCotizacion
     */
    public int getNumCotizacion() {
        return numCotizacion;
    }

    /**
     * @param numCotizacion the numCotizacion to set
     */
    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
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
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the pagoInicial
     */
    public int getPagoInicial() {
        return pagoInicial;
    }

    /**
     * @param pagoInicial the pagoInicial to set
     */
    public void setPagoInicial(int pagoInicial) {
        this.pagoInicial = pagoInicial;
    }

    /**
     * @return the plazo
     */
    public int getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }
    
    public int pagoInicial()
    {
        int precioPI;
        precioPI=precio*pagoInicial/100;
        return precioPI;       
    }
    
    public int totalAFin ()
    {
       int totalAFin;
       totalAFin=precio-pagoInicial();
       return totalAFin;
    }
    
    public int pagoMensual()
    {
        int pagoM;
        pagoM=totalAFin()/plazo;
        return pagoM;
    }
}
