package ar.edu.unq.po2.tp2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpresaTest {
	private Empresa cruce ;
	private Empleado ivan ;
	@BeforeEach
	public void setUp () {
		cruce =  new Empresa("CRUCE", "371861723");
	}
	
	@Test
	public void companyData() {
		assertEquals(cruce.getCorporateName(), "CRUCE");
		assertEquals(cruce.getCuit(), "371861723");
	}

}
