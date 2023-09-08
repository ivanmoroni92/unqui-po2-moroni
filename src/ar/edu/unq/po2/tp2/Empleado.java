package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Empleado {
  protected String nombre ;
  protected String direccion ;
  protected Boolean estadoCivil ;
  protected LocalDate  fechaDeNacimiento ;
  protected double sueldoBasico ;
  private  ArrayList<ReciboDeHaberes> recibosDehaberes;
  
  public Empleado(String nombre,String direccion, Boolean estadoCivil,LocalDate fechaDeNacimiento, double sueldoBasico) {
	  this.nombre = nombre ;
	  this.direccion = direccion ;
	  this.estadoCivil = estadoCivil ;
	  this.fechaDeNacimiento = fechaDeNacimiento ;
	  this.sueldoBasico = sueldoBasico ;
	  this.recibosDehaberes = new ArrayList<ReciboDeHaberes>() ;
	  
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
   public Boolean getEstadoCivil() {
	   return estadoCivil ;
   }
   
   public void setEstadoCivil(Boolean estadoCivil ) {
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
   
   
   public ArrayList<ReciboDeHaberes> getRecibosDehaberes() {
 		return recibosDehaberes;
 	   }

    protected void addReciboDehaberes(ReciboDeHaberes reciboDehaberes) {
 		recibosDehaberes.add(reciboDehaberes);
 	   }
    
    protected void createAndSaveReciboDehaberes()   {
    	this.addReciboDehaberes( new ReciboDeHaberes(this));

 	   }
    
    
    protected ArrayList<DesgloceDeConcepto> listaDeConceptos() {
    	ArrayList<DesgloceDeConcepto> arrConcepto = new ArrayList<DesgloceDeConcepto>() ;
    	arrConcepto.add(new DesgloceDeConcepto("OBRA SOCIAL", -this.gastosPorObraSocial()));
    	arrConcepto.add(new DesgloceDeConcepto("APORTE JUBILATORIO", -this.gastosPorAporteJubilatorio()));
    	return arrConcepto ;
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
     
   
  
  
}
