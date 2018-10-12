/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2c2;

import javax.swing.JOptionPane;

/**
 *
 * @author PC21
 */
public class Practica2C2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProductoPerecedero nuevo1= new ProductoPerecedero();
        ProductoNoPerecedero nuevo3= new ProductoNoPerecedero();
        Factura nueva1=new Factura();
        //con datos ya ingresados
        ProductoPerecedero nuevo = new ProductoPerecedero(1,"leche",2,15.50F,"20/10/2018",
        13);
        ProductoNoPerecedero nuevo2 = new ProductoNoPerecedero(1,"miel",2,185,"PTVC50");
        Factura nueva = new Factura(1,"12/10/2018","Venta de leche",nuevo,3,1,"PTMVC1000",
        "Pancho","Su Rancho","12/10/2018",16);
        int id,unidad,numeroNota,tipoPago,iva;
        String nombre,concepto,domicilio,fecha,fechaF,rfc,nombreCliente,fechaDeCaducidad,lote;
        float cantidad,temperatura,precioUnitario;
        
        Object menu[] = {"1.- Iniciar objetos sin datos","2.- Ver Productos","3.- Calcular Precio Unitario","4.- Calcular Factura","5.- Revisar la Factura","6.- Salir"};
        Object subMenu[] = {"1- Crear Producto Perecedero","2- Crear Producto No Perecedero","3- Crear Factura","4- Salir"};
        Object subMenu2[] = {"1- Producto Perecedero","2- Producto No Perecedero","3- Salir"};
        Object subMenu3[] = {"1- Calcular Impuesto","2- Calcular SubTotal","3- Calcular Total a Pagar","4- Salir"};
        String opcSubMenu ="";
        String opcSubMenu2 ="";
        String opcSubMenu3 ="";
        String opcSubMenu4 ="";
        String opcMenu = "";
        
        do
        {
            opcMenu = (String) JOptionPane.showInputDialog(null,"Elije una opción", "Menu", JOptionPane.QUESTION_MESSAGE,null,menu,menu[0]);
            switch(opcMenu)
            {
                case "1.- Iniciar objetos sin datos":
                    do
                    {
                        opcSubMenu = (String) JOptionPane.showInputDialog(null,"Elije una opción", "SubMenu", JOptionPane.QUESTION_MESSAGE,null,subMenu,subMenu[0]);
                        switch(opcSubMenu)
                        {
                            case "1- Crear Producto Perecedero":
                                id= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el id del Producto","Producto Perecedero",JOptionPane.QUESTION_MESSAGE));
                                nombre=(JOptionPane.showInputDialog(null,"Digite el nombre del producto", "Producto Perecedero", JOptionPane.QUESTION_MESSAGE));
                                unidad= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tipo de unidad 1=Kg/2=Litros/3=Piezas","Producto Perecedero",JOptionPane.QUESTION_MESSAGE));
                                precioUnitario= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el precio base del producto","Producto Perecedero",JOptionPane.QUESTION_MESSAGE));
                                fechaDeCaducidad =(JOptionPane.showInputDialog(null, "Digite la fecha de caducidad EXAMPLE: 01/01/2000", "Producto Perecedero", JOptionPane.QUESTION_MESSAGE));
                                temperatura= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la temperatura de precerbación","Producto Perecedero",JOptionPane.QUESTION_MESSAGE));
                    
                                nuevo1.setId(id);
                                nuevo1.setNombre(nombre);
                                nuevo1.setUnidad(unidad);
                                nuevo1.setPrecioUnitario(precioUnitario);
                                nuevo1.setFechaDeCaducidad(fechaDeCaducidad);
                                nuevo1.setTemperatura(temperatura);
                                JOptionPane.showMessageDialog(null, "Se han iniciado el objeto de forma satisfactoria");
                                break;
                            case "2- Crear Producto No Perecedero":   
                                id= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el id del Producto","Producto No Perecedero",JOptionPane.QUESTION_MESSAGE));
                                nombre=(JOptionPane.showInputDialog(null,"Digite el nombre del producto", "Producto No Perecedero", JOptionPane.QUESTION_MESSAGE));
                                unidad= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el tipo de unidad 1=Kg/2=Litros/3=Piezas","Producto No Perecedero",JOptionPane.QUESTION_MESSAGE));
                                precioUnitario= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite el precio base del producto","Producto No Perecedero",JOptionPane.QUESTION_MESSAGE));
                                lote =(JOptionPane.showInputDialog(null, "Digite el lote del producto", "Producto No Perecedero", JOptionPane.QUESTION_MESSAGE));
                                
                                nuevo3.setId(id);
                                nuevo3.setNombre(nombre);
                                nuevo3.setUnidad(unidad);
                                nuevo3.setPrecioUnitario(precioUnitario);
                                nuevo3.setLote(lote);
                                JOptionPane.showMessageDialog(null, "Se han iniciado el objeto de forma satisfactoria");
                                break;
                            case "3- Crear Factura":   
                                numeroNota= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero de la factura","Nota de Venta",JOptionPane.QUESTION_MESSAGE));
                                fecha =(JOptionPane.showInputDialog(null,"Digite la fecha de la nota", "Nota de Venta", JOptionPane.QUESTION_MESSAGE));
                                concepto = (JOptionPane.showInputDialog(null,"Digite el concepto de la factura","Nota de Venta",JOptionPane.QUESTION_MESSAGE));
                                cantidad = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la cantidad de producto","Nota de Venta",JOptionPane.QUESTION_MESSAGE));
                                tipoPago = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite tipo de pago\n1=Contado 2=Credito", "Nota de Venta", JOptionPane.QUESTION_MESSAGE));
                                
                                rfc= (JOptionPane.showInputDialog(null,"Digite el rfc","Factura",JOptionPane.QUESTION_MESSAGE));
                                nombreCliente =(JOptionPane.showInputDialog(null,"Digite el nombre del cliente","Factura", JOptionPane.QUESTION_MESSAGE));
                                domicilio = (JOptionPane.showInputDialog(null,"Digite el domicilio del cliente","Factura",JOptionPane.QUESTION_MESSAGE));
                                fechaF = (JOptionPane.showInputDialog(null,"Digite la fecha de facturación","Factura",JOptionPane.QUESTION_MESSAGE));
                                iva = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el iva","Factura", JOptionPane.QUESTION_MESSAGE));
                                JOptionPane.showMessageDialog(null, "Se han iniciado el objeto de forma satisfactoria");
                                
                                nueva1.setNumeroNota(numeroNota);
                                nueva1.setFecha(fecha);
                                nueva1.setConcepto(concepto);
                                nueva1.setCantidad(cantidad);
                                nueva1.setTipoPago(tipoPago);
                                nueva1.setProducto(nuevo1);
                                nueva1.setRfc(rfc);
                                nueva1.setNombreCliente(nombreCliente);
                                nueva1.setDomicilio(domicilio);
                                nueva1.setFechaF(fechaF);
                                nueva1.setIva(iva);
                                break;
                            case "4- Salir":
                                break;
                        }
                    }while(!"4- Salir".equals(opcSubMenu));
                    break;
                case "2.- Ver Productos":
                    do
                    {
                        opcSubMenu2 = (String) JOptionPane.showInputDialog(null,"Elije una opción", "SubMenu", JOptionPane.QUESTION_MESSAGE,null,subMenu2,subMenu2[0]);
                        switch(opcSubMenu2)
                        {
                            case "1- Producto Perecedero":
                                JOptionPane.showMessageDialog(null, "Id: " + nuevo.getId()+"\nNombre: "+nuevo.getNombre()+"\nUnidad\n1=Kg \n2=Litros \n3=Piezas\n"+nuevo.getUnidad()+
                                "\nPrecio Base: "+nuevo.getPrecioUnitario()+"\nFecha de Caducidad: " +nuevo.getFechaDeCaducidad()+"\nTemperatura:"+nuevo.getTemperatura());
                                break;
                            case "2- Producto No Perecedero":   
                                JOptionPane.showMessageDialog(null, "Id: " + nuevo2.getId()+"\nNombre: "+nuevo2.getNombre()+"\nUnidad\n1=Kg \n2=Litros \n3=Piezas\n"+nuevo2.getUnidad()+
                                "\nPrecio Base: "+nuevo2.getPrecioUnitario()+"\nLote: " +nuevo2.getLote());
                                break;
                            case "3- Salir":
                                break;
                        }
                    }while(!"3- Salir".equals(opcSubMenu2));
                    break;
                case "3.- Calcular Precio Unitario":
                    float precioU;
                    do
                    {
                        opcSubMenu3 = (String) JOptionPane.showInputDialog(null,"Elije una opción", "SubMenu", JOptionPane.QUESTION_MESSAGE,null,subMenu2,subMenu2[0]);
                        switch(opcSubMenu3)
                        {
                            case "1- Producto Perecedero":
                                precioU = nuevo1.calcularPrecioUnitario();
                                //precioU = nuevo.calcularPrecioUnitario();
                                JOptionPane.showMessageDialog(null, "El precio unitario es de:"+ precioU);
                                break;
                            case "2- Producto No Perecedero":   
                                precioU = nuevo2.calcularPrecioUnitario();
                                JOptionPane.showMessageDialog(null, "El precio unitario es de:"+ precioU);
                                break;
                            case "3- Salir":
                                break;
                        }
                    }while(!"3- Salir".equals(opcSubMenu3));
                    break;
                case "4.- Calcular Factura":
                    float subtotal;
                    float impuesto;
                    float total;
                    do
                    {
                        opcSubMenu4 = (String) JOptionPane.showInputDialog(null,"Elije una opción", "SubMenu", JOptionPane.QUESTION_MESSAGE,null,subMenu3,subMenu3[0]);
                        switch(opcSubMenu4)
                        {
                            case "1- Calcular Impuesto":
                                impuesto = nueva1.calcularImpuesto();//para objetos hechos por el usuario
                                //impuesto = nueva.calcularImpuesto();
                                JOptionPane.showMessageDialog(null, "El impuesto es de:"+ impuesto);
                                break;
                            case "2- Calcular SubTotal":
                                subtotal = nueva1.calcularPago();//para objetos hechos por el usuario
                                //subtotal = nueva.calcularPago();
                                JOptionPane.showMessageDialog(null, "El subtotal es de:"+ subtotal);
                                break;
                            case "3- Calcular Total a Pagar":
                                total = nueva1.calcularTotal(); //para objetos hechos por el usuario
                                //total = nueva.calcularTotal();
                                JOptionPane.showMessageDialog(null, "El precio total es de:"+ total);
                                break;
                            case "4- Salir":
                                break;
                        }
                    }while(!"4- Salir".equals(opcSubMenu4));
                    break;
                case "5.- Revisar la Factura":
                    /*JOptionPane.showMessageDialog(null, "Numero de Nota: " + nueva.getNumeroNota()+"\nFecha de la Nota: "+nueva.getFecha()+"\nConcepto:"+nueva.getConcepto()+
                    "\nNombre del Producto: "+nueva.getProducto().getNombre()+"\nCantidad: " +nueva.getCantidad()+"\nTipo de Pago\n1=Contado 2=Credito:"+nueva.getTipoPago()+
                    "\nRFC:"+nueva.getRfc()+"\nNombre del Cliente:"+nueva.getNombreCliente()+"\nDomicilio:"+nueva.getDomicilio()+"\nFecha de Facturación:"+nueva.getFechaF()+"\nIVA:"+nueva.getIva());*/
                    //para objetos hechos por el usuario
                    JOptionPane.showMessageDialog(null, "Numero de Nota: " + nueva1.getNumeroNota()+"\nFecha de la Nota: "+nueva1.getFecha()+"\nConcepto:"+nueva1.getConcepto()+
                    "\nNombre del Producto: "+nueva1.getProducto().getNombre()+"\nCantidad: " +nueva1.getCantidad()+"\nTipo de Pago\n1=Contado 2=Credito:"+nueva1.getTipoPago()+
                    "\nRFC:"+nueva1.getRfc()+"\nNombre del Cliente:"+nueva1.getNombreCliente()+"\nDomicilio:"+nueva1.getDomicilio()+"\nFecha de Facturación:"+nueva1.getFechaF()+"\nIVA:"+nueva1.getIva());
                    break;
                case "6.- Salir":
                    JOptionPane.showMessageDialog(null, "Gracias por usar este programa");
                     break;
            }
        }while(!"6.- Salir".equals(opcMenu));
    }
        
}
