/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerapracticafecha;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class BoletoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numBoleto=0, numCliente=0,op=0,tipoDeViaje=1;
        float precio=0.0F;
        Object menu[] = {"1.- Iniciar Objeto","2.- Mostrar","3.- Calcular precio","4.- Salir"};
        String opcMenu = "";
        String destino="",fecha="";
        Boleto hoy= new Boleto();
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
        switch(opcMenu)
         {
            case "1.- Iniciar Objeto":
                 numBoleto = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero del boleto", "Boleto", JOptionPane.QUESTION_MESSAGE));
                 numCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame el numero del cliente", "Boleto", JOptionPane.QUESTION_MESSAGE));
                 destino = (JOptionPane.showInputDialog(null, "Digita el destino", "Boleto", JOptionPane.QUESTION_MESSAGE));
                 tipoDeViaje = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita el tipo de Viaje 1=Sencillo 2=Redondo", "Boleto", JOptionPane.QUESTION_MESSAGE));
                 fecha = (JOptionPane.showInputDialog(null, "Dame la fecha \nEXAMPLE=00/00/0000", "Fecha", JOptionPane.QUESTION_MESSAGE));
                 
                 
                  hoy.setNumBoleto(numBoleto);
                  hoy.setNumCliente(numCliente);
                  hoy.setDestino(destino);
                  hoy.setTipoDeViaje(tipoDeViaje);
                  hoy.setFecha(fecha);
                  
                  break;
            case "2.- Mostrar":
                JOptionPane.showMessageDialog(null, "Numero del Boleto: " + numBoleto+"\nNumero del Cliente: "+numCliente+"\nDestino:"+destino+"\nTipo de Viaje: "+tipoDeViaje+"\nFecha: "+fecha+"\n Precio:"+precio );
                break;
            case "3.- Calcular precio":
                int edad=0;
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Dame la edad", "Edad", JOptionPane.QUESTION_MESSAGE));
                precio = hoy.descuento(edad);
               JOptionPane.showMessageDialog(null,"El precio con descuento es:" + precio);
                break;
            case "4.- Salir":
                JOptionPane.showMessageDialog(null,"Gracias por su Visita");
                break;
            default:
                JOptionPane.showMessageDialog(null,"No es una opción valida");
                break;
            }
        }while(!"4.- Salir".equals(opcMenu));    
    }
}
