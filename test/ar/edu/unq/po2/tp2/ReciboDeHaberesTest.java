package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReciboDeHaberesTest {
    public Empleado empleado ; 
    public  ReciboDeHaberes recibo ;
    public LocalDate fechaDeNacimineto ;
    public LocalDate fechaFinDesignacion ;
	@BeforeEach
	void setUp() {
		fechaDeNacimineto = LocalDate.of(1992,10,27) ;
		fechaFinDesignacion = LocalDate.of(2023,12,31) ;
    	empleado = new PlantaTemporaria("Ivan","Martin Fierro 1165",true ,fechaDeNacimineto,300000,fechaFinDesignacion, 10);	
    	recibo = new ReciboDeHaberes(empleado); 
 
	}

	@Test
	void nombreDelEmpleado() {
		assertEquals("Ivan", recibo.getNombreDelEmpleado()); 
	}
	
	@Test
	void direccion() {
		assertEquals("Martin Fierro 1165", recibo.getDireccion()); 
	}
	
	@Test
	void fechaDeEmision() {
		assertEquals(2023, recibo.getFechaDeEmision().getYear()); 
	}
	
	@Test
	void sueldoBruto() {
		assertEquals(300400, recibo.getSueldoBruto()); 
	}
	
	@Test
	void sueldoNeto() {
		assertEquals(240270, recibo.getSueldoNeto()); 
	}
	
	@Test
	void listaDeConceptos() {
		assertEquals(4, recibo.getDesgloceDeConceptos().size()); 
		assertEquals("OBRA SOCIAL", recibo.getDesgloceDeConceptos().get(0).getKey());
		assertEquals(-30040, recibo.getDesgloceDeConceptos().get(0).getValue()); 
	}
	
	

}
