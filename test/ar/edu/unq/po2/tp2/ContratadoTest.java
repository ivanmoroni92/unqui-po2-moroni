package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContratadoTest {
    public Contratado nicolas ;
    public LocalDate fechaDeNacimiento;
    public MedioDepago medioDePago ;
	@BeforeEach
	void setUp()  {
		fechaDeNacimiento = LocalDate.of(2000,7,7) ;
		medioDePago =  MedioDepago.TRANSFERENCIA_BANCARIA;
		nicolas =  new Contratado("Nicolas", "Av.Caseros 2233", false ,fechaDeNacimiento,510000, 1212 , medioDePago) ;
	}

	@Test
	void medioDePago() {
		assertEquals(MedioDepago.TRANSFERENCIA_BANCARIA, nicolas.getMedioDePago());
	}
	
	@Test
	void sueldoBruto() {
		assertEquals(510000, nicolas.getSueldoBruto());
	}
	
	@Test
	void restricciones() {
		assertEquals(50, nicolas.getRestricciones());
	}
	
	@Test
	void sueldoNeto() {
		assertEquals(509950, nicolas.getSueldoNeto());
	}



}
