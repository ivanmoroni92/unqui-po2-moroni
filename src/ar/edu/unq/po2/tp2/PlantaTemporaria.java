package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.ArrayList;


public class PlantaTemporaria extends Empleado {
    
	private  LocalDate fechaFinDesignacion  ;
	private int horasExtra ;
	
	public PlantaTemporaria (String nombre,String direccion, Boolean estadoCivil,LocalDate fechaDeNacimiento, double sueldoBasico,LocalDate fechaFinDesignacion, int horasExtra ) {
		super(nombre,direccion,estadoCivil,fechaDeNacimiento,sueldoBasico) ;
		this.fechaFinDesignacion = fechaFinDesignacion ;
		this.horasExtra = horasExtra ;
	}
	
	
	
	public LocalDate getFechaFinDesignacion() {
		return fechaFinDesignacion ;
 	}
	
	public void setFechaFinDesignacion(int ano, int mes, int dia) {
		this.fechaFinDesignacion = LocalDate.of(ano,mes,dia) ;
 	}
	
	public int getHorasExtra() {
		return horasExtra ;
 	}
	
	public void setHorasExtra(int horas ) {
		 horasExtra += horas ;
 	}
	
	public void restaurarHorasExtra() {
		 horasExtra = 0 ;
	}
	
	
	protected int getSalarioHorasExtra() {
		return horasExtra * 40 ;
	}
	
	@Override
	public double getSueldoBruto() {
		return this.getSueldoBasico() +  this.getSalarioHorasExtra() ;
	  }
	
	@Override
	
	protected double gastosPorObraSocial() {
		return this.getSueldoBruto() * 0.1 + ( this.getEdad() > 50 ? 25  : 0) ;
	}
	
	
	@Override
	protected double gastosPorAporteJubilatorio() {
		return this.getSueldoBruto() * 0.1 +  this.getHorasExtra() * 5;
	}
	
	
	@Override
	 protected ArrayList<DesgloceDeConcepto> listaDeConceptos() {
	    	ArrayList<DesgloceDeConcepto> arrConcepto = super.listaDeConceptos();
	    	arrConcepto.add(new DesgloceDeConcepto("SUELDO BASICO", this.getSueldoBasico()));
	    	arrConcepto.add(new DesgloceDeConcepto("HORAS EXTRA", this.getSalarioHorasExtra()));
	    	return arrConcepto ;
	   } 
	
	
	
	
	
	
	
	
	
	
	  
}
