package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlantaPermanenteTest {
    public PlantaPermanente matias ;
    public LocalDate fechaDeNacimiento ; 
   
    
	@BeforeEach
	public void setUp() {
		fechaDeNacimiento = LocalDate.of(2000,7,7) ;
		matias =  new PlantaPermanente("Matias", "Palermo 1254", false ,fechaDeNacimiento,600000, 0 , 4) ;
		
	}

	@Test
	public void nombre() {
		assertEquals("Matias",matias.getNombre() );
	}
	
	
	@Test
	public void direccion() {
		assertEquals("Palermo 1254",matias.getDireccion() );
	}
	
	@Test
	public void estadoCivil() {
		assertFalse(matias.getEstadoCivil());
	}
	
	@Test
	public void fechaDeNacimiento() {
		LocalDate fechaDeNacimiento2 = LocalDate.of(2000,7,7) ;
		assertEquals(fechaDeNacimiento2,matias.getFechaDeNacimiento() );
	}
	
	@Test
	public void sueldoBasico() {
		assertEquals(600000, matias.getSueldoBasico());
	}
	
	@Test
	public void cantHijos() {
		assertEquals(0, matias.getCantHijos());
	}
	
	@Test
	public void antiguedad() {
		assertEquals(4, matias.getAntiguedad());
	}
	
	@Test
	public void salarioFamiliar() {
		assertEquals(0, matias.getSalarioFamiliar());
		assertNotEquals(10,  matias.getSalarioFamiliar());
		
	}
	
	
	@Test
	public void salarioPorAntiguedad() {
		assertEquals(200, matias.getSalarioPorAntiguedad());
			
	}
	
	
	@Test
	public void sueldoBruto() {
		assertEquals(600200, matias.getSueldoBruto());
			
	}
	
	
	@Test
	public void gastosPorObraSocial() {
		assertEquals(60020, matias.gastosPorObraSocial());
			
	}
	
	@Test
	public void gastosPorAporteJubilatorio() {
		assertEquals(90030, matias.gastosPorAporteJubilatorio());
			
	}
	
	@Test
	public void restricciones() {
		assertEquals(150050, matias.getRestricciones());
			
	}
	
	@Test
	public void sueldoNeto() {
		assertEquals(450150, matias.getSueldoNeto());
			
	}

}
