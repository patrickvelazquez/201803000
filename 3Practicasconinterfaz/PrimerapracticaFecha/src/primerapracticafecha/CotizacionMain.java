/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerapracticafecha;
import java.util.Scanner;
import javax.swing.JOptionPane;
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
        Object menu[] = {"1- Iniciar Objeto","2- Mostrar","3- Calcular Pago Inicial","4- Calcular Total a Fin","5- Calcular Pago Mensual","6- Salir"};
        String opcMenu = "";
        String destino="";
        String descripcion="";
        Cotizacion nueva= new Cotizacion();
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
            switch(opcMenu)
         {
            case "1- Iniciar Objeto":
                  numCotizacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero de la cotizacion", "Cotizacion", JOptionPane.QUESTION_MESSAGE));
                  precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Precio", "Cotizacion", JOptionPane.QUESTION_MESSAGE));
                  descripcion = (JOptionPane.showInputDialog(null, "Descripcion", "Cotizacion", JOptionPane.QUESTION_MESSAGE));
                  pagoInicial = Integer.parseInt(JOptionPane.showInputDialog(null, "Pago Inicial", "Cotizacion", JOptionPane.QUESTION_MESSAGE));
                  plazo = Integer.parseInt(JOptionPane.showInputDialog(null, "Plazo", "Cotizacion", JOptionPane.QUESTION_MESSAGE));
                 
                  nueva.setNumCotizacion(numCotizacion);
                  nueva.setPrecio(precio);
                  nueva.setDescripcion(descripcion);
                  nueva.setPagoInicial(pagoInicial);
                  nueva.setPlazo(plazo);
                  break;
            case "2- Mostrar":
                JOptionPane.showMessageDialog(null, "Numero de la Cotizacion: " + numCotizacion+"\nDescripcion: "+descripcion+"\nPrecio:"+precio+"\nMensualidad: "+pagoM+"\nPago Inicial: "+precioPI+"\nTotal a Fi:"+totalAFin );
                break;
            case "3- Calcular Pago Inicial":
                precioPI=nueva.pagoInicial();
                JOptionPane.showMessageDialog(null,"El Pago Inicial es:" + precioPI);
                break;
            case "4- Calcular Total a Fin":
                totalAFin=nueva.totalAFin();
                JOptionPane.showMessageDialog(null,"El Total a Financiar es:" + totalAFin);
                break;
            case "5- Calcular Pago Mensual":
                pagoM=nueva.pagoMensual();
                JOptionPane.showMessageDialog(null,"La Mensualidad es:" + pagoM);
                break;
            case "6- Salir":
                JOptionPane.showMessageDialog(null,"Gracias por su Visita");
                break;
            default:
                JOptionPane.showMessageDialog(null,"No es una opción valida");
                break;
            }
        }while(!"6- Salir".equals(opcMenu));    
    }   
}
