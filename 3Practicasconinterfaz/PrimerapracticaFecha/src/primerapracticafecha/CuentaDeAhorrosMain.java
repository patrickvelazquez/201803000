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
public class CuentaDeAhorrosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCuenta=0, saldo=0,op=0,importe=0;
        Object menu[] = {"1- Aperturar Cuenta","2- Mostrar","3- Realizar Deposito","4- Realizar Retiro","5- Consultar Saldo","6- Salir"};
        String opcMenu = "";
        String fechaA="",sucursal="",nCliente="",domicilio="",fechaN="";

        CuentaDeAhorros otra= new CuentaDeAhorros();
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
        switch(opcMenu)
         {
            case "1- Aperturar Cuenta":
                int edad=0;
                saldo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su Saldo", "Apertura", JOptionPane.QUESTION_MESSAGE));
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su Edad", "Apertura", JOptionPane.QUESTION_MESSAGE));
                if(otra.aperturar(saldo, edad)==true)
                {
                 numCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de la cuenta", "Cuenta de ahorro", JOptionPane.QUESTION_MESSAGE));
                 fechaA = (JOptionPane.showInputDialog(null, "Ingrese la fecha de apertura", "Cuenta de ahorro", JOptionPane.QUESTION_MESSAGE));
                 sucursal = (JOptionPane.showInputDialog(null, "Ingrese el nombre sucursal", "Cuenta de ahorro", JOptionPane.QUESTION_MESSAGE));
                 nCliente = (JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente", "Cuenta de ahorro", JOptionPane.QUESTION_MESSAGE));
                 domicilio = (JOptionPane.showInputDialog(null, "Domicilio", "ingrese el domicilio", JOptionPane.QUESTION_MESSAGE));
                 fechaN = (JOptionPane.showInputDialog(null, "Ingrese la fecha de nacimiento", "Cuenta de ahorro", JOptionPane.QUESTION_MESSAGE));
                 System.out.println("Dame el numero de Cuenta");
                 
                 otra.setNumeroDeCuenta(numCuenta);
                 otra.setFechaA(fechaA);
                 otra.setSucursal(sucursal);
                 otra.setnCliente(nCliente);
                 otra.setDomicilio(domicilio);
                 otra.setFechaN(fechaN);
                 otra.setSaldo(saldo);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"No se pudo aperturar la cuenta:");
                }
                  break;
            case "2- Mostrar":
               JOptionPane.showMessageDialog(null, "Numero de Cuentan: " + numCuenta+"\nSaldo: "+saldo+"\nFecha de Apertura:"+fechaA+"\nSucursal: "+sucursal+"\nNombre del Cliente: "+nCliente+"\nDomicilio:"+domicilio+"\nFecha de Nacimiento del Cliente:"+fechaN );
                break;
            case "3- Realizar Deposito":
                importe=0;
                importe =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el importe del deposito", "Deposito", JOptionPane.QUESTION_MESSAGE));
                saldo=otra.deposito(importe);
                JOptionPane.showMessageDialog(null,"Su nuevo saldo es de:"+ saldo);
                break;
            case "4- Realizar Retiro":
                importe=0;
                importe =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el importe del retiro", "Retiro", JOptionPane.QUESTION_MESSAGE));
                saldo=otra.retiro(importe);
                break;
            case "5- Consultar Saldo":
                otra.saldo();
                break;
            case "6- Salir":
                JOptionPane.showMessageDialog(null,"Gracias por su Visita");
                break;
            default:
                JOptionPane.showMessageDialog(null,"No es una opcion valida");
                break;
            }
        }while(!"6- Salir".equals(opcMenu));   
    }
    
}
