package processadorBoleto;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import boleto.Boleto; 
import processadorBoleto.ProcessadorBoleto;

public class ProcessadorBoletoTest {
	private ProcessadorBoleto processador;

	@BeforeEach
	private void inicializar() {
		processador = new ProcessadorBoleto();
	}
	
	@DisplayName ("Testa Fatura1 Paga")
	@Test
	public void pagarFatura1Test() {
		List<Boleto> listaBoleto = new ArrayList<>();
		Boleto boleto1 = new Boleto();
		Boleto boleto2 = new Boleto();
		Boleto boleto3 = new Boleto();
		float valorFinal = 1500;
		
		boleto1.setCodFatura(1);
		boleto1.setValorBoleto(500);
		boleto1.setData(LocalDate.of(2020, 12, 05));
		
		boleto2.setCodFatura(1);
		boleto2.setValorBoleto(400);
		boleto2.setData(LocalDate.of(2021, 01, 05));
		
		boleto3.setCodFatura(1);
		boleto3.setValorBoleto(600);
		boleto3.setData(LocalDate.of(2021, 02, 05));
		
		listaBoleto.add(boleto1);
		listaBoleto.add(boleto2);
		listaBoleto.add(boleto3);
		
		float valorTotalFatura1 = processador.processarFatura(listaBoleto, valorFinal);
		
		assertTrue(valorTotalFatura1 >= valorFinal);
	}
	
	@DisplayName ("Testa Fatura2 Paga")
	@Test
	public void pagarFatura2Test() {
		List<Boleto> listaBoleto = new ArrayList<>();
		Boleto boleto1 = new Boleto();
		Boleto boleto2 = new Boleto();
		Boleto boleto3 = new Boleto();
		float valorFinal = 1500;
		boleto1.setCodFatura(2);
		boleto1.setValorBoleto(1000);
		boleto1.setData(LocalDate.of(2020, 12, 05));
		
		boleto2.setCodFatura(2);
		boleto2.setValorBoleto(500);
		boleto2.setData(LocalDate.of(2021, 01, 05));
		
		boleto3.setCodFatura(2);
		boleto3.setValorBoleto(250);
		boleto3.setData(LocalDate.of(2021, 02, 05));
		
		listaBoleto.add(boleto1);
		listaBoleto.add(boleto2);
		listaBoleto.add(boleto3);
		
		float valorTotalFatura2 = processador.processarFatura(listaBoleto, valorFinal);
		assertTrue(valorTotalFatura2 >= valorFinal);
	}
	
	@DisplayName ("Testa Fatura3 Paga")
	@Test
	public void pagarFatura3Test() {
		List<Boleto> listaBoleto = new ArrayList<>();
		Boleto boleto1 = new Boleto();
		Boleto boleto2 = new Boleto();
		float valorFinal = 2000;
		boleto1.setCodFatura(3);
		boleto1.setValorBoleto(500);
		boleto1.setData(LocalDate.of(2020, 12, 05));
	
		boleto2.setCodFatura(3);
		boleto2.setValorBoleto(400);
		boleto2.setData(LocalDate.of(2021, 01, 05));
		
		listaBoleto.add(boleto1);
		listaBoleto.add(boleto2);

		float valorTotalFatura3 = processador.processarFatura(listaBoleto, valorFinal);
		assertFalse(valorTotalFatura3 >= valorFinal);
	}	
}
