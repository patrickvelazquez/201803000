/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomba;

/**
 *
 * @author Software 05
 */
public class Gasolina {
    private int id;
    private String marca;
    private int tipo;
    private float precioBase;
    
    public Gasolina()
    {
        this.id=1;
        this.marca="default";
        this.tipo=1;
        this.precioBase=0.0F;
    }
    
    public Gasolina(int id,String marca,int tipo, float precioBase)
    {
        this.id=id;
        this.marca=marca;
        this.tipo=tipo;
        this.precioBase=precioBase;
    }
    
    public Gasolina(Gasolina otra)
    {
        this.id=otra.id;
        this.marca=otra.marca;
        this.tipo=otra.tipo;
        this.precioBase=otra.precioBase;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the precioBase
     */
    public float getPrecioBase() {
        return precioBase;
    }

    /**
     * @param precioBase the precioBase to set
     */
    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    
    public float calcularPrecio()
    {
        float precio = 0.0F;
        switch (tipo) {
            case 1:
                precio=precioBase+(precioBase*0.10F);
                break;
            case 2:
                precio=precioBase+(precioBase*0.20F);
                break;
            case 3:
                precio=precioBase+(precioBase*0.25F);
                break;
            default:
                break;
        }
        return precio;     
    }
    
}

