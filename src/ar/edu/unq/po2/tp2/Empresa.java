package ar.edu.unq.po2.tp2;
import java.util.ArrayList;


public class Empresa {
    
	
   private String name ;
   private String cuit ;
   private  ArrayList<String> empleados; // ArrayList<Empleado>
	
   public Empresa( String name, String cuit  ) {
	   this.name = name ;
	   this.cuit = cuit ;
	   this.empleados = new ArrayList<>(); 
   }
   
   public String getCorporateName() {
	   return name ;
   }
   
   public String getCuit() {
	   return cuit ;
   }
   
   public void addEmpleado(String empleado) {
	   empleados.add(empleado);
   }
   
   
   
}
