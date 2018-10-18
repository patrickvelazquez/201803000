/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.swing.JOptionPane;

/**
 *
 * @author PC08
 */
import javax.swing.JOptionPane;
public class ExamenMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPuesto,nivelAcademico,tipoPuesto,numMaterias,numEmpleado;
        String descripcion,funciones,nombre,fechaIngreso;
        float pagoH,pago=0.0F,perseccion=0.0F,impuesto=0.0F;
        
        Object menu[]={"1) Captura de empleado docente","2) Captura de Puesto",
                       "3) Calculo de pago de docente","4) Calculo de persecciones",
                       "5) Calculo de impuesto","6) Total a pagar","7) Salir"};
        String opcMenu="";
        EmpleadoDocente nuevo= new EmpleadoDocente();
        Puesto nuevo1= new Puesto();
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            switch(opcMenu)
            {
                case "1) Captura de empleado docente":
                    numEmpleado=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero del Empleado", "Empleado", JOptionPane.QUESTION_MESSAGE));
                    nombre=(JOptionPane.showInputDialog(null,"Digite el nombre del Empleado", "Empleado", JOptionPane.QUESTION_MESSAGE));
                    fechaIngreso=(JOptionPane.showInputDialog(null,"Digite la fecha de ingreso", "Empleado", JOptionPane.QUESTION_MESSAGE));
                    numMaterias=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de materias impartidas", "Empleado", JOptionPane.QUESTION_MESSAGE));
                    pagoH=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el pago por hora", "Empleado", JOptionPane.QUESTION_MESSAGE));
                    
                    nuevo.setNombre(nombre);
                    nuevo.setNumEmpleado(numEmpleado);
                    nuevo.setFechaIngreso(fechaIngreso);
                    nuevo.setNumMaterias(numMaterias);
                    nuevo.setPagoH(pagoH);
                    nuevo.setPuesto(nuevo1);
                    
                    JOptionPane.showMessageDialog(null, "Se han iniciado el objeto de forma satisfactoria");
                    break;
                case "2) Captura de Puesto":
                    numPuesto=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero del puesto", "Puesto", JOptionPane.QUESTION_MESSAGE));
                    descripcion=(JOptionPane.showInputDialog(null,"Digite la descripcion", "Puesto", JOptionPane.QUESTION_MESSAGE));
                    funciones=(JOptionPane.showInputDialog(null,"Digite las funciones del puesto", "Puesto", JOptionPane.QUESTION_MESSAGE));
                    nivelAcademico=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el nivel academico \n 1=1 Tecnico, 2 Lic eIng, 3 Maestria y 4 Doctorado", "Puesto", JOptionPane.QUESTION_MESSAGE));
                    tipoPuesto=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tipo de puesto 1=Eventual 2=Base", "Puesto", JOptionPane.QUESTION_MESSAGE));
                    
                    nuevo1.setNumPuesto(numPuesto);
                    nuevo1.setDescripcion(descripcion);
                    nuevo1.setFunciones(funciones);
                    nuevo1.setNivelAcademico(nivelAcademico);
                    nuevo1.setTipoPuesto(tipoPuesto);
                    
                    JOptionPane.showMessageDialog(null, "Se han iniciado el objeto de forma satisfactoria");
                    break;
                case "3) Calculo de pago de docente":
                    pago=nuevo.calcularPago();
                    JOptionPane.showMessageDialog(null, "El pago es de:"+pago);
                    break;
                case "4) Calculo de persecciones":
                    perseccion=nuevo.calcularPerseccion();
                    JOptionPane.showMessageDialog(null, "La perseccion es de:"+perseccion);
                    break;
                case "5) Calculo de impuesto":
                    impuesto=nuevo.calcularImpuesto();
                    JOptionPane.showMessageDialog(null, "El impuesto es de:"+impuesto);
                    break;
                case "6) Total a pagar":
                    float total=impuesto+perseccion+pago;
                    JOptionPane.showMessageDialog(null, "El total es de:"+total);
                    break;
                case "7) Salir":
                    JOptionPane.showMessageDialog(null, "Gracias por usar este programa");
                    break;
            }
        }while(!"7) Salir".equals(opcMenu));
    }
}
