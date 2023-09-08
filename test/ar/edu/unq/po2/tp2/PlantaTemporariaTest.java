package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class  PlantaTemporariaTest {
    private Empleado ivan ;
    private LocalDate fechaDeNacimineto;
    private LocalDate fechaFinDesignacion;
    
    @BeforeEach
	public void setUp() {
    	fechaDeNacimineto = LocalDate.of(1992,10,27) ;
    	fechaFinDesignacion = LocalDate.of(2023,12,31) ;
    	ivan = new PlantaTemporaria("Ivan","Martin Fierro 1165",true ,fechaDeNacimineto,300000,fechaFinDesignacion, 10) ;
	}
    

	@Test
	public void nombre() {
		assertEquals("Ivan",ivan.getNombre() );
	}
	
	
	@Test
	public void direccion() {
		assertEquals("Martin Fierro 1165",ivan.getDireccion() );
	}
	
	@Test
	public void estadoCivil() {
		assertTrue(ivan.getEstadoCivil());
	}
	
	@Test
	public void fechaDeNacimiento() {
		LocalDate fechaDeNacimiento2 =  LocalDate.of(1992,10,27) ;
		assertEquals(fechaDeNacimiento2,ivan.getFechaDeNacimiento() );
	}
	
	@Test
	public void sueldoBasico() {
		assertEquals(300000, ivan.getSueldoBasico());
	}
	
	
	@Test
	public void sueldoBruto() {
		assertEquals(300400, ivan.getSueldoBruto());
			
	}
	
	
	@Test
	public void gastosPorObraSocial() {
		assertEquals(30040, ivan.gastosPorObraSocial());
			
	}
	
	@Test
	public void gastosPorAporteJubilatorio() {
		assertEquals(30090, ivan.gastosPorAporteJubilatorio());
			
	}
	
	@Test
	public void restricciones() {
		assertEquals(60130, ivan.getRestricciones());
			
	}
	
	@Test
	public void sueldoNeto() {
		assertEquals(240270, ivan.getSueldoNeto());
			
	}
	
	@Test
	public void cantidadDeRecibosLiquidados() {
		assertEquals(2, ivan.getRecibosDehaberes().size());

	}
	
	
	@Test
	public void ReciboDeHaberesDeIvan() {
		assertEquals("Ivan", ivan.getRecibosDehaberes().get(0).getNombreDelEmpleado());
        assertEquals(240270, ivan.getRecibosDehaberes().get(0).getSueldoNeto());
	}

}
