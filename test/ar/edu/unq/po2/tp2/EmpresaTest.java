package ar.edu.unq.po2.tp2;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTest {
	private Empresa cruce ;
	private Empleado ivan ;
	private Empleado matias ;
	public LocalDate fechaDeNacimientoIvan ; 
	public LocalDate fechaDeNacimientoMatias ; 
	private LocalDate fechaFinDesignacion;
	@BeforeEach
	public void setUp () {
		// fechas
		fechaDeNacimientoMatias = LocalDate.of(2000,7,7) ;
		fechaDeNacimientoIvan = LocalDate.of(1992,10,27) ;
		fechaFinDesignacion = LocalDate.of(2023,12,31) ;
		// Empleados
		matias =  new PlantaPermanente("Matias", "Palermo 1254", false ,fechaDeNacimientoMatias,600000, 0 , 4) ;
    	ivan = new PlantaTemporaria("Ivan","Martin Fierro 1165",true ,fechaDeNacimientoIvan,300000,fechaFinDesignacion, 10) ;
    	// Empresa
		cruce =  new Empresa("CRUCE", "371861723");
		// Add Empleados
		cruce.addEmpleado(ivan);
		cruce.addEmpleado(matias);
		
		//method Cruce
		
		
	}
	
	@Test
	public void companyData() {
		assertEquals("CRUCE", cruce.getCorporateName() );
		assertEquals("371861723",cruce.getCuit());
	}
	
	@Test
	public void cantEmpleados() {
	    assertEquals(2, cruce.getEmpleados().size());
	}
	
	@Test
	public void montoTotalNeto() {
		assertEquals(690420, cruce.montoTotalNeto());
	}
	
	@Test
	public void montoTotalBruto() {
		assertEquals(900600, cruce.montoTotalBruto());

	}
	@Test
	public void montoTotalRetenciones() {
		assertEquals(210180, cruce.montoTotalRetenciones());

	}
	
	@Test
	public void liquidacionDeSuledos() {
		assertEquals(0, ivan.getRecibosDehaberes().size());
		assertEquals(0, matias.getRecibosDehaberes().size());
		cruce.liquidaciónDeSueldos();
		assertEquals(1, ivan.getRecibosDehaberes().size());
		assertEquals(1, matias.getRecibosDehaberes().size());
		assertEquals(4, ivan.getRecibosDehaberes().get(0).getDesgloceDeConceptos().size()); 
		

	}
	
	
	


}
