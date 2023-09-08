package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReciboDeHaberes {
	private String nombreDelEmpleado ;
	private String direccion ;
	private LocalDate fechaDeEmision;
	private double sueldoBruto ;
	private double sueldoNeto;
	private  ArrayList<DesgloceDeConcepto> desgloceDeConceptos ;
	



	public ReciboDeHaberes( Empleado empleado) {
		this.nombreDelEmpleado = empleado.getNombre();
		this.direccion = empleado.getDireccion();
		this.fechaDeEmision = LocalDate.now();
		this.sueldoBruto = empleado.getSueldoBruto();
		this.sueldoNeto = empleado.getSueldoNeto();
		this.desgloceDeConceptos = empleado.listaDeConceptos()   ;	
		}
	
	
	
	public String getNombreDelEmpleado() {
		return nombreDelEmpleado;
	}
	public String getDireccion() {
		return direccion;
	}
	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}
	public double getSueldoBruto() {
		return sueldoBruto;
	}
	public double getSueldoNeto() {
		return sueldoNeto;
	}
	
	public ArrayList<DesgloceDeConcepto> getDesgloceDeConceptos() {
		return desgloceDeConceptos;
	}

	
}
