/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerapracticafecha;

import java.util.Scanner;
public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numBoleto=0, numCliente=0,op=0,tipoDeViaje=1;
        float precio=0.0F;
        String destino="",fecha="";
        Boleto hoy= new Boleto();
        do
        {
            System.out.println("1- Iniciar Objeto");
            System.out.println("2- Mostrar");
            System.out.println("3- Calcular precio");
            System.out.println("4- Salir");
         
            op =in.nextInt();
        switch(op)
         {
            case 1:
                 System.out.println("Dame el numero del boleto");
                 numBoleto = in.nextInt ();
                 
                 System.out.println("Dame el numero del cliente");
                 numCliente = in.nextInt();
                 
                 System.out.println("Dame el destino");
                 destino = in.next();
                 
                 System.out.println("Dame el tipo de viaje");
                 tipoDeViaje = in.nextInt();
                 
                 System.out.println("Dame la fecha");
                 fecha = in.next();
                 
                  hoy.setNumBoleto(numBoleto);
                  hoy.setNumCliente(numCliente);
                  hoy.setDestino(destino);
                  hoy.setTipoDeViaje(tipoDeViaje);
                  hoy.setFecha(fecha);
                  
                  break;
            case 2:
                System.out.println("El boleto contiene la siguiente informacion");
                System.out.println("Numero del Boleto:" + numBoleto); 
                System.out.println("Numero del Cliente:"+ numCliente); 
                System.out.println("Destino:"+ destino); 
                System.out.println("Tipo de Viaje:"+ tipoDeViaje); 
                System.out.println("Fecha:"+ fecha);
                System.out.println("Precio:"+ precio);
                break;
            case 3:
                int edad=0;
                System.out.println("Digite la Edad");
                edad = in.nextInt();
                precio = hoy.descuento(edad);
                System.out.println("El precio con descuento es:" + precio);
                break;
            case 4:
                System.out.println("Gracias por su Visita");
                break;
            default:
                System.out.println("No es una opción valida");
                break;
            }
        }while(op!=4);    
    }
}
