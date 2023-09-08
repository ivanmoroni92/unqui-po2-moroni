package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.print.attribute.standard.Media;




public class Contratado extends Empleado {
    public int numeroDeContrato ;
    public MedioDepago medioDePago ;

	public Contratado(String nombre, String direccion, Boolean estadoCivil, LocalDate fechaDeNacimiento,
			double sueldoBasico, int numeroDeContrato, MedioDepago medioDePago) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		this.medioDePago = medioDePago ;
		this.numeroDeContrato = numeroDeContrato ;
	}
	
	
	public MedioDepago getMedioDePago() {
		return medioDePago;
	}


	public void setMedioDePago(MedioDepago medioDePago) {
		this.medioDePago = medioDePago;
	}
	
	
		public int getNumeroDeContrato() {
		return numeroDeContrato;
	}


		@Override
	   public  double getSueldoBruto(){
			return this.getSueldoBasico() ;
		}
	
		@Override
	   protected  double gastosPorObraSocial(){
			return 0 ;
		}
		@Override
	   protected  double gastosPorAporteJubilatorio() {
			return 0 ;	
		}
		
		@Override
		public double getRestricciones() {
			return this.gastosAdministrativosContractuales() ;
		  }
		
		public double gastosAdministrativosContractuales() {
			return 50 ;
		}
		
		@Override
		 protected ArrayList<DesgloceDeConcepto> listaDeConceptos() {
		    	ArrayList<DesgloceDeConcepto> arrConcepto = super.listaDeConceptos();
		    	arrConcepto.add(new DesgloceDeConcepto("SUELDO BASICO", this.getSueldoBasico()));
		    	arrConcepto.add(new DesgloceDeConcepto("ADMINISTRATIVOS CONTRACTUALES", -this.gastosAdministrativosContractuales()));
		    	return arrConcepto ;
		   } 
		

}


