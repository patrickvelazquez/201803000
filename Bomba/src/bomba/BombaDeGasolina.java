/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomba;

import javax.swing.JOptionPane;

/**
 *
 * @author Software 05
 */
public class BombaDeGasolina {
    private int numBomba;
    private Gasolina tGasolina;
    private int capacidad;
    private int contadorLV;
    
    BombaDeGasolina()
    {
        this.numBomba=01;
        this.tGasolina=null;
        this.capacidad=1000;
        this.contadorLV=0;
    }
    
    BombaDeGasolina(int numBomba,Gasolina tGasolina,int capacidad,int contadorLV)
    {
        this.numBomba=numBomba;
        this.tGasolina=tGasolina;
        this.capacidad=capacidad;
        this.contadorLV=contadorLV;
    }
    
    BombaDeGasolina(BombaDeGasolina otra)
    {
        this.numBomba=otra.numBomba;
        this.tGasolina=otra.tGasolina;
        this.capacidad=otra.capacidad;
        this.contadorLV=otra.contadorLV;
    }

    /**
     * @return the numBomba
     */
    public int getNumBomba() {
        return numBomba;
    }

    /**
     * @param numBomba the numBomba to set
     */
    public void setNumBomba(int numBomba) {
        this.numBomba = numBomba;
    }

    /**
     * @return the tGasolina
     */
    public Gasolina gettGasolina() {
        return tGasolina;
    }

    /**
     * @param tGasolina the tGasolina to set
     */
    public void settGasolina(Gasolina tGasolina) {
        this.tGasolina = tGasolina;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the contadorLV
     */
    public int getContadorLV() {
        return contadorLV;
    }

    /**
     * @param contadorLV the contadorLV to set
     */
    public void setContadorLV(int contadorLV) {
        this.contadorLV = contadorLV;
    }
    
    public int verificarInventario ()
    {
        int inventario =capacidad-contadorLV;
        return inventario;
    }
    
    public float venta(int litros)
    {
        float precio=0.0F;
        if(litros<=verificarInventario())
        {
            contadorLV=contadorLV+litros;
            precio=litros*tGasolina.calcularPrecio();
            JOptionPane.showMessageDialog(null, "Precio: " + precio);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No hay suficiente gasolina" );
        }
        return precio;
    }
    
    public float ventaTotal()
    {
        float total=contadorLV*tGasolina.calcularPrecio();
        return total;
    }
}
