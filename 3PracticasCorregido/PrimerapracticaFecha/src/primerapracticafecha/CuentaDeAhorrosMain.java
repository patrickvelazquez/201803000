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
public class CuentaDeAhorrosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCuenta=0, saldo=0,op=0,importe=0;
        String fechaA="",sucursal="",nCliente="",domicilio="",fechaN="";

        CuentaDeAhorros otra= new CuentaDeAhorros();
        do
        {
            System.out.println("1- Aperturar Cuenta");
            System.out.println("2- Mostrar");
            System.out.println("3- Realizar Deposito");
            System.out.println("4- Realizar Retiro");
            System.out.println("5- Consultar Saldo");
            System.out.println("6- Salir");
         
            op =in.nextInt();
        switch(op)
         {
            case 1:
                int edad=0;
                System.out.println("Ingrese el saldo para la apertura");
                saldo = in.nextInt();
                System.out.println("Ingrese su Edad");
                edad = in.nextInt();
                if(otra.aperturar(saldo, edad)==true)
                {
                 System.out.println("Dame el numero de Cuenta");
                 numCuenta = in.nextInt ();
                 
                 System.out.println("Dame la fecha de Apertura");
                 fechaA = in.next();
                 
                 System.out.println("Nombre de la Sucursal");
                 sucursal = in.next();
                 
                 System.out.println("Dame el Nombre del Cliente");
                 nCliente = in.next();
                 
                 System.out.println("Dame su Domicilio");
                 domicilio = in.next();
                 
                 System.out.println("Dame su Fecha de Nacimiento");
                 fechaN = in.next();
                 
                 
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
                    System.out.println("No se pudo aperturar la cuenta");
                }
                  break;
            case 2:
                System.out.println("La cuenta contiene la siguiente informacion");
                System.out.println("Numero de la Cuenta:" + numCuenta); 
                System.out.println("Saldo:"+ saldo); 
                System.out.println("Fecha de Apertura:"+ fechaA); 
                System.out.println("Sucursal:"+ sucursal); 
                System.out.println("Nombre del Ciente:"+ nCliente);
                System.out.println("Domicilio:"+ domicilio);
                System.out.println("Fecha de Nacimiento del Cliente:"+ fechaN);
                break;
            case 3:
                importe=0;
                System.out.println("Digite el importe del deposito");
                importe = in.nextInt();
                saldo=otra.deposito(importe);
                System.out.println("Su nuevo saldo es de:"+ saldo);
                break;
            case 4:
                importe=0;
                System.out.println("Digite el importe del retiro");
                importe = in.nextInt();
                saldo=otra.retiro(importe);
                break;
            case 5:
                otra.saldo();
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
