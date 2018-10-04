package empleados;

/**
 *
 * @author Nicolini
 */
public class Empleados 
{
    private int numEmpleado, sueldoBase, nivel, comision;
    private String nombre, domicilio;
    
    public Empleados()
    {
        numEmpleado=1;
        nombre= " ";
        domicilio= " ";
        sueldoBase= 1;
        nivel=1;
        comision=1;
    }
    
    public Empleados(int NumeroEmpleado, String Nombre, String Domicilio, int SueldoBase, int Nivel, int Comision)
    {
        numEmpleado=NumeroEmpleado;
        nombre=Nombre;
        domicilio=Domicilio;
        sueldoBase=SueldoBase;
        nivel=Nivel;
        comision=Comision;
    }
    
    public Empleados(Empleados otro)
    {
        numEmpleado=otro.numEmpleado;
        nombre=otro.nombre;
        domicilio=otro.domicilio;
        sueldoBase=otro.sueldoBase;
        nivel=otro.nivel;
        comision=otro.comision;
    }
    
    public int getNumEmpleado()
    {
        return numEmpleado;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getDomicilio()
    {
        return domicilio;
    }
    
    public int getSueldoBase()
    {
        return sueldoBase;
    }
    
    public int getNivel()
    {
        return nivel;
    }
    
    public int getComision()
    {
        return comision;
    }
    
    public void setNumEmpleado(int numEmpleado)
    {
        this.numEmpleado=numEmpleado;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public void setDomicilio(String domicilio)
    {
        this.domicilio=domicilio;
    }
    
    public void setSueldoBase(int sueldoBase)
    {
        this.sueldoBase=sueldoBase;
    }
    
    public void setNivel(int nivel)
    {
        this.nivel=nivel;
    }
    
    public void setComision(int comision)
    {
        this.comision=comision;
    }
    
    public int pago (int ventas)
    {
        int pagoTotal=0;
        if (nivel == 1)
            pagoTotal=(int) ((comision / 100)+(ventas *.02));
        else if(nivel==2)
            pagoTotal=(int) ((comision / 100)+(ventas *.05));
        return pagoTotal;
    }
    
    public int calcularBono()
    {
        int total=0;
        if (nivel == 1)
            total=(int) (sueldoBase*.05);
        else if(nivel==2)
            total=(int) (sueldoBase*.10);
        return total;
    }
    
    public int calcularPago(int ventas)
    {
        int total=0;
        total=calcularBono()+pago(ventas)+sueldoBase;
        return total;
    }
}
