/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerapracticafecha;
import java.util.Scanner;


/**
 *
 * @author PC02
 */
public class PrimerapracticaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int dia=0,mes=0,año=0,op=0;
        Fecha hoy = new Fecha();
        do
        {
         System.out.println("1- Iniciar Objeto");
         System.out.println("2- Mostrar");
         System.out.println("3- Numero de dias del mes");
         System.out.println("4- Ver si es año Bisiesto");
         System.out.println("5- Modificar Fecha");
         System.out.println("6- Salir");
         
         op =in.nextInt();
         
         switch(op)
         {
            case 1:
                 System.out.println("Dame el dia");
                 dia = in.nextInt();
                 
                 System.out.println("Dame el mes");
                 mes = in.nextInt();
                 
                 System.out.println("Dame el año");
                 año = in.nextInt();
                  hoy.setDia(dia);
                  hoy.setMes(mes);
                  hoy.setAño(año);
                  
                  break;
            case 2:
                System.out.println("la fecha es " +hoy.fechaConFormato());
                break;
            case 3:
                mes = hoy.getMes();
                System.out.println("El mes numero " + mes + " tiene " + hoy.diasDelMes());
                break;
            case 4:
                if(hoy.isBisiesto())
                {
                    System.out.println("El año " + hoy.getAño() + " es bisiesto");
                }
                else
                {
                    System.out.println("El año " + hoy.getAño() + "no es bisiesto");
                }
                break;
            case 5:
                do{                   
                    System.out.println("Elija lo que quiere modificar");
                    System.out.println("1- Modificar Dia");
                    System.out.println("2- Modificar Mes");
                    System.out.println("3- Modificar Año");
                    System.out.println("4- Regresar");
                    op = in.nextInt();
                    switch(op)
                    {
                        case 1:
                            System.out.println("Dame el dia");
                            dia = in.nextInt();
                            hoy.setDia(dia);
                            break;
                        case 2:
                            System.out.println("Dame el mes");
                            mes = in.nextInt();
                            hoy.setMes(mes);
                            break;
                        case 3:
                            System.out.println("Dame el año");
                            año = in.nextInt();
                            hoy.setAño(año);
                            break;
                        case 4: 
                            break;
                        default:
                            System.out.println("No es una opción valida");
                    }
                }while(op!=4);
                break;
            case 6:
                System.out.println("Gracias por su visita");
                break;
            default:
                System.out.println("No es una opción valida");
                break;
         }
         System.out.println("Presione cualquier tecla para continua");
            in.nextInt();
        }while(op!=6);
        // TODO code application logic here
    }
    
}
