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
public class ProductoPerecedero extends Producto {

 
    private String fechaDeCaducidad;
    private float temperatura;
    
    public ProductoPerecedero()
    {
        this.fechaDeCaducidad="";
        this.temperatura=0.0F;
    }
    
    public ProductoPerecedero(int id,String nombre,int unidad,float precioUnitario,
            String fechaDeCaducidad,float temperatura)
    {
        super(id,nombre,unidad,precioUnitario);  
        this.fechaDeCaducidad=fechaDeCaducidad;
        this.temperatura=temperatura;
    }

    /**
     * @return the fechaDeCaducidad
     */
    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    /**
     * @param fechaDeCaducidad the fechaDeCaducidad to set
     */
    public void setFechaDeCaducidad(String fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    /**
     * @return the temperatura
     */
    public float getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    @Override
    public float calcularPrecioUnitario() {
        float precio=0;
        switch(unidad)
        {
            case 1:
                precio=precioUnitario+(precioUnitario*53/100);
                break;
            case 2:
                precio=precioUnitario+(precioUnitario*55/100);
                break;
            case 3:
                precio=precioUnitario+(precioUnitario*54/100);
                break; 
        };
        return precio;
    }
}
