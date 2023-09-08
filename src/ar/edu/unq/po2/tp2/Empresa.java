package ar.edu.unq.po2.tp2;
import java.util.ArrayList;


public class Empresa {
    
	
   private String name ;
   private String cuit ;
   private  ArrayList<Empleado> empleados;
 
	
   

public Empresa( String name, String cuit  ) {
	   this.name = name ;
	   this.cuit = cuit ;
	   this.empleados = new ArrayList<Empleado>(); 
	  
   }
   
   public String getCorporateName() {
	   return name ;
   }
   
   public String getCuit() {
	   return cuit ;
   }
   
   public void addEmpleado(Empleado empleado) {
	   empleados.add(empleado);
   }
   
   public ArrayList<Empleado>  getEmpleados() {
	   return empleados ;
   }
   
   
   public double  montoTotalNeto() {
	   double sumaSueldos = 0.0;
       
       for (Empleado empleado : empleados) {
           sumaSueldos += empleado.getSueldoNeto();
       }
       
       return sumaSueldos;
	    
   }   
   
   public double  montoTotalBruto() {
	   double sumaSueldosBruto = 0.0;
       
       for (Empleado empleado : empleados) {
    	   sumaSueldosBruto += empleado.getSueldoBruto();
       }
       
       return sumaSueldosBruto;
	    
   }   
   
   public double  montoTotalRetenciones() {
	   double sumaRetenciones = 0.0;
       
       for (Empleado empleado : empleados) {
    	   sumaRetenciones += empleado.getRestricciones();
       }
       
       return sumaRetenciones;
	    
   } 
   
 
   
   
   public void liquidaciónDeSueldos() {
	   for (Empleado empleado : empleados) {
		   empleado.createAndSaveReciboDehaberes(); ;
       }
   }
   
   
}
