package empleados;
import java.util.Scanner;
/**
 *
 * @author Nicolini
 */
public class EmpleadosMain 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int numEmpleado, sueldoBase, nivel, comision, ventas;
        String nombre, domicilio;
        Empleados Aux = new Empleados();
         
         System.out.println("Capturar Informacion del Vendedor.");
         System.out.println("Numero de Empleado: ");
         numEmpleado=in.nextInt();
         System.out.println("Nombre: "); 
         nombre=in.next();
         System.out.println("Domicilio: "); 
         domicilio=in.next();
         System.out.println("Sueldo Base: ");
         sueldoBase=in.nextInt();
         System.out.println("Nivel: ");
         nivel=in.nextInt();
         System.out.println("Comision  : ");
         comision=in.nextInt();
         System.out.println("Ventas: ");
         ventas=in.nextInt();
         Aux.setNumEmpleado(numEmpleado);
         Aux.setNombre(nombre);
         Aux.setDomicilio(domicilio);
         Aux.setNivel(nivel);
         Aux.setSueldoBase(sueldoBase);
         Aux.setComision(comision);
         Aux.pago(ventas);
         System.out.println("Pago por comision: $"+Aux.pago(ventas));
         System.out.println("Bono: $" +Aux.calcularBono());
         System.out.println("Pago Total: $" +Aux.calcularPago(ventas));
    }
}

