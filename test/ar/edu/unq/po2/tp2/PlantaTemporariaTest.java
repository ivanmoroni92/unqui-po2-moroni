package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class  PlantaTemporariaTest {
    private Empleado empleado1 ;
    private LocalDate fecha;
    @BeforeEach
	public void setUp() {
    	fecha = LocalDate.of(1992,10,27) ;
    	empleado1 = new PlantaTemporaria("ivan","martin fierro 1165","Soltero",fecha,300000,fecha, 2) ;
	}
    
	@Test
	 public void nombreDelEmpleado() {
		assertEquals(empleado1.getNombre(), "ivan");
	}
	
	@Test
	 public void direccionDelEmpleado() {
		assertEquals(empleado1.getDireccion(), "martin fierro 1165");
	}
	

	@Test
	 public void fechaDeNacimientoDelEmpleado() {
		assertEquals(empleado1.getFechaDeNacimiento(),LocalDate.of(1992,10,27));
	}
	
	@Test
	 public void estadoCivilEmpleado() {
		assertEquals(empleado1.getEstadoCivil(), "Soltero");
	}
	
	@Test
	 public void edadDelEmpleado() {
		assertEquals(empleado1.getEdad(), 30);
	}
	@Test
	 public void SueldoDelEmpleado() {
		assertEquals(empleado1.getSueldoBasico(), 300000);
	}

}
