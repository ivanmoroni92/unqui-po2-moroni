package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
  protected String nombre ;
  protected String direccion ;
  protected String estadoCivil ;
  protected LocalDate  fechaDeNacimiento ;
  protected double sueldoBasico ;
  
  public Empleado(String nombre,String direccion, String estadoCivil,LocalDate fechaDeNacimiento, double sueldoBasico) {
	  this.nombre = nombre ;
	  this.direccion = direccion ;
	  this.estadoCivil = estadoCivil ;
	  this.fechaDeNacimiento = fechaDeNacimiento ;
	  this.sueldoBasico = sueldoBasico ;
	  
  }
  
   // nombre del empleado
   public String getNombre() {
	   return nombre ;
   }
   
   // direccion del empleado
   public String getDireccion() {
	   return direccion ;
   }
   
   public void setDireccion(String direccion ) {
	  this.direccion = direccion ;
   }
// EstadoCivil del empleado
   public String getEstadoCivil() {
	   return estadoCivil ;
   }
   
   public void setEstadoCivil(String estadoCivil ) {
	  this.estadoCivil = estadoCivil ;
   }
   
   
   // FechaDeNacimiento
   
   public LocalDate getFechaDeNacimiento () {
	   return fechaDeNacimiento ;
   }
   
   public void setFechaDeNacimiento (int ano, int mes, int dia   ) { 
	   this.fechaDeNacimiento = LocalDate.of(ano,mes,dia) ;
   }
   
   
   //sueldo basico 
   
   public double getSueldoBasico () {
	   return sueldoBasico ;
   }
   
   public void setSueldoBasico (double sueldoBasico) {
	   this.sueldoBasico =  sueldoBasico;
   }
   
   
   // Other methods
   
   public int getEdad() {
	   Period periodo = Period.between(fechaDeNacimiento, LocalDate.now());
       return  periodo.getYears();
   }
   
   
   public double getSueldoNeto() {
	   
	   return this.getSueldoBruto() - this.getRestricciones() ;
	   
   }
   

	public double getRestricciones() {
		return this.gastosPorObraSocial() + this.gastosPorAporteJubilatorio();
	  }
   
   
   public  abstract  double getSueldoBruto() ;
  
   protected abstract double gastosPorObraSocial() ;
   protected abstract double gastosPorAporteJubilatorio();
   
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
     
   
  
  
}
