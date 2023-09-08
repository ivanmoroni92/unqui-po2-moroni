package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class PlantaPermanente  extends Empleado {
	
	private int cantHijos ;
	private int antiguedad ;
	
	
	public PlantaPermanente (String nombre,String direccion, Boolean estadoCivil,LocalDate fechaDeNacimiento, double sueldoBasico, int cantHijos, int antiguedad) {
		super(nombre,direccion,estadoCivil,fechaDeNacimiento,sueldoBasico) ;
		this.cantHijos = cantHijos ;
		this.antiguedad = antiguedad ;
	}
	
	
	public int getCantHijos(){
		return cantHijos ;
	}
	
	public void setCantHijos(int cantHijos){
		this.cantHijos = cantHijos ;
	}
	
	public int getAntiguedad () {
		return antiguedad ;	
	}
	public void setAntiguedads(int antiguedad){
		this.antiguedad = antiguedad ;
	}
	
	
	
	public double  getSalarioFamiliar() {
		return this.getAsignacionPorHijo() + this.getAsignacionPorConyuge() ;
	}
	
	private double getAsignacionPorHijo() {
		return  cantHijos * 150 ;
	}
	
	private int getAsignacionPorConyuge() {
		return  estadoCivil ? 100 : 0;
	}
	
	
	public int getSalarioPorAntiguedad() {
		return antiguedad * 50 ;
	}
	
	
	@Override
	public double getSueldoBruto() {
		return this.getSueldoBasico() + this.getSalarioFamiliar() +  this.getSalarioPorAntiguedad();
	}
	

	
	
	
	@Override
	
	protected double gastosPorObraSocial() {
		return this.getSueldoBruto() * 0.1 + 20 *cantHijos ;
	}
	
	
	@Override
	protected double gastosPorAporteJubilatorio() {
		return this.getSueldoBruto() * 0.15 ;
	}
	
	@Override
	 protected ArrayList<DesgloceDeConcepto> listaDeConceptos() {
	    	ArrayList<DesgloceDeConcepto> arrConcepto = super.listaDeConceptos();
	    	arrConcepto.add(new DesgloceDeConcepto("SUELDO BASICO", this.getSueldoBasico()));
	    	arrConcepto.add(new DesgloceDeConcepto("SALARIO FAMILIAR", this.getSalarioFamiliar()));
	    	arrConcepto.add(new DesgloceDeConcepto("SALARIO POR ANTIGUEDAD", this.getSalarioPorAntiguedad()));
	    	return arrConcepto ;
	   } 
	
	 
}


/*
 * 
 * MAPEO DE SUELDO NETO 
 *  sueldoBruto
 *  restrstricciones
 *  sueldoNeto() = sueldoBruto - restrstricciones
 * 
 * 
 * 
 * empleado alta :
 * sueldoBruto = Sueldo Básico + Salario Familiar +  Asignación por cónyuge +  Antigüedad
 * retenciones = Obra Social + Aportes Jubilatorios
 * 
 * 
 *  empleado de planta: 
 *   sueldoBruto = Sueldo Básico + Horas Extras:  
 *   retenciones = Obra Social: +  Aportes Jubilatorios 
 * */ 