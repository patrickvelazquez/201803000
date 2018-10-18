/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerapracticafecha;

/**
 *
 * @author Software 05
 */
public class Boleto {
    private int numBoleto;
    private int numCliente;
    private String destino;
    private int tipoDeViaje;
    private float precio;
    private String fecha;
    
    public Boleto()
    {
     this.numBoleto=01;
     this.numCliente=01;
     this.destino=" ";
     this.tipoDeViaje=1;
     this.precio=0.0f;
     this.fecha="01/01/2000";
    }
    
    public Boleto(int numBoleto,int numCliente, String destino, int tipoDeViaje,float precio, String fecha)
    {
        this.numBoleto=numBoleto;
        this.numCliente=numCliente;
        this.destino=destino;
        this.tipoDeViaje=tipoDeViaje;
        this.precio=precio;
        this.fecha=fecha;
    }
    
    public Boleto(Boleto otro)
    {
        this.numBoleto=otro.numBoleto;
        this.numCliente=otro.numCliente;
        this.destino=otro.destino;
        this.tipoDeViaje=otro.tipoDeViaje;
        this.precio=otro.precio;
        this.fecha=otro.fecha;
    }

    /**
     * @return the numBoleto
     */
    public int getNumBoleto() {
        return numBoleto;
    }

    /**
     * @param numBoleto the numBoleto to set
     */
    public void setNumBoleto(int numBoleto) {
        this.numBoleto = numBoleto;
    }

    /**
     * @return the numCliente
     */
    public int getNumCliente() {
        return numCliente;
    }

    /**
     * @param numCliente the numCliente to set
     */
    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the tipoDeViaje
     */
    public int getTipoDeViaje() {
        return tipoDeViaje;
    }

    /**
     * @param tipoDeViaje the tipoDeViaje to set
     */
    public void setTipoDeViaje(int tipoDeViaje) {
        this.tipoDeViaje = tipoDeViaje;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
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
    
    public float impuesto()
    {
        float precioI=subTotal();
        precioI=precioI+(precioI*16/100);
        return precioI;       
    }
    
    public float subTotal ()
    {
       float regular=950.00F;
       if(tipoDeViaje==2)
       {
           regular=regular+(regular*80/100);
       }
       return regular;
    }
    
    public float descuento(int edad)
    {
        float desc;
        
        float precioI=impuesto();
        if(edad>=60)
        {
            desc=precioI-(precioI*50/100);
            precioI=precioI-desc;
        }
        return precioI;
    }
    
}
