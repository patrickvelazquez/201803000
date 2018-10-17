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
public class ProductoNoPerecedero extends Producto {
    private String lote;
    
    public ProductoNoPerecedero()
    {
        this.lote="";
    }
    
    public ProductoNoPerecedero(int id,String nombre,int unidad,float precioUnitario,
            String lote)
    {
        super(id,nombre,unidad,precioUnitario);
        this.lote=lote;   
    }

    /**
     * @return the lote
     */
    public String getLote() {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(String lote) {
        this.lote = lote;
    }
    
    @Override
    public float calcularPrecioUnitario() {
        float precio=0.0F;
        precio=precioUnitario+(precioUnitario*0.50F);
        return precio;
    }
}
