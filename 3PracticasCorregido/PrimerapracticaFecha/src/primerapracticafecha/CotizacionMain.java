/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerapracticafecha;
import java.util.Scanner;
/**
 *
 * @author Administrador
 */
public class CotizacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCotizacion=0, precio=0,plazo=0,precioPI=0,pagoM=0,totalAFin=0;
        int op=0,pagoInicial=0;
        String descripcion="";
        Cotizacion nueva= new Cotizacion();
        do
        {
            System.out.println("1- Iniciar Objeto");
            System.out.println("2- Mostrar");
            System.out.println("3- Calcular Pago Inicial");
            System.out.println("4- Calcular Total a Fin");
            System.out.println("5- Calcular Pago Mensual");
            System.out.println("6- Salir");
         
            op =in.nextInt();
        switch(op)
         {
            case 1:
                 System.out.println("Dame el numero de la Cotizacion");
                 numCotizacion = in.nextInt ();
                 
                 System.out.println("Dame el precio del carro");
                 precio = in.nextInt();
                 
                 System.out.println("Dame la descripcion");
                 descripcion = in.next();
                 
                 System.out.println("Deme el porcentaje de pago inicial");
                 pagoInicial = in.nextInt();
                 
                 System.out.println("Deme el plazo de pago");
                 plazo = in.nextInt();
                 
                  nueva.setNumCotizacion(numCotizacion);
                  nueva.setPrecio(precio);
                  nueva.setDescripcion(descripcion);
                  nueva.setPagoInicial(pagoInicial);
                  break;
            case 2:
                System.out.println("La Cotización contiene la siguiente informacion");
                System.out.println("Numero de la Cotización:" + numCotizacion); 
                System.out.println("Descripcion:"+ descripcion); 
                System.out.println("Precio:"+ precio); 
                System.out.println("Mensualidad:"+ pagoM); 
                System.out.println("Pago Inicial:"+ precioPI);
                System.out.println("Total a Fin:"+ totalAFin);
                break;
            case 3:
                precioPI=nueva.pagoInicial();
                System.out.println("Su pago inicial es de:"+ precioPI);
                break;
            case 4:
                totalAFin=nueva.totalAFin();
                System.out.println("Su Total a Financiar es de:"+ totalAFin);
                break;
            case 5:
                pagoM=nueva.pagoMensual();
                System.out.println("Su pago mensual será de:"+ pagoM);
                break;
            case 6:
                System.out.println("Gracias por su Visita");
                break;
            default:
                System.out.println("No es una opción valida");
                break;
            }
        }while(op!=6);    
    }   
}
