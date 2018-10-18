/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerapracticafecha;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CuentaDeAhorros {
    private int numeroDeCuenta;
    private int saldo;
    private String fechaA;//apertura
    private String sucursal;
    private String nCliente;
    private String domicilio;
    private String fechaN;//nacimiento
    
    public CuentaDeAhorros()
    {
        this.numeroDeCuenta=01;
        this.saldo=01;
        this.fechaA="01/01/2000";
        this.sucursal="";
        this.nCliente="";
        this.domicilio="";
        this.fechaN="01/01/2000";
    }
    
    public CuentaDeAhorros(int numeroDeCuenta,int saldo, String fechaA, String sucursal, String nCliente, String domicilio, String fechaN)
    {
        this.numeroDeCuenta=numeroDeCuenta;
        this.saldo=saldo;
        this.fechaA=fechaA;
        this.sucursal=sucursal; 
        this.nCliente=nCliente;
        this.domicilio=domicilio;
        this.fechaN=fechaN;
    }
    
    public CuentaDeAhorros(CuentaDeAhorros otra)
    {
        this.numeroDeCuenta=otra.numeroDeCuenta;
        this.saldo=otra.saldo;
        this.fechaA=otra.fechaA;
        this.sucursal=otra.sucursal;
        this.nCliente=otra.nCliente;
        this.domicilio=otra.domicilio;
        this.fechaN=otra.fechaN;
    }
    /**
     * @return the numeroDeCuenta
     */
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    /**
     * @param numeroDeCuenta the numeroDeCuenta to set
     */
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the sucursal
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * @return the nCliente
     */
    public String getnCliente() {
        return nCliente;
    }

    /**
     * @param nCliente the nCliente to set
     */
    public void setnCliente(String nCliente) {
        this.nCliente = nCliente;
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
     * @return the fechaN
     */
    public String getFechaN() {
        return fechaN;
    }

    /**
     * @param fechaN the fechaN to set
     */
    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    /**
     * @return the fechaA
     */
    public String getFechaA() {
        return fechaA;
    }

    /**
     * @param fechaA the fechaA to set
     */
    public void setFechaA(String fechaA) {
        this.fechaA = fechaA;
    }
               
    public boolean aperturar(int dinero, int edad)
    {
        boolean ok=false;
        if(dinero>=1000 && edad>=18)
            ok=true;
        return ok;
    }
    
    public int deposito(int importe)
    {
        this.saldo=saldo+importe;
        return saldo;
    }
    
    public int retiro(int importe)
    {
        if(importe<saldo)
        {
            this.saldo=saldo-importe;
            JOptionPane.showMessageDialog(null,"Su nuevo saldo es de:"+ saldo);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No tiene suficiente saldo");
        }
        return saldo;
    }
    
    public void saldo()
    {
        JOptionPane.showMessageDialog(null,"Su saldo es de:"+ saldo);
    }
}


