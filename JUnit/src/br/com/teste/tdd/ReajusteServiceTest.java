package br.com.teste.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.modelo.tdd.Desempenho;
import br.com.modelo.tdd.Funcionario;
import br.com.service.tdd.ReajusteService;

public class ReajusteServiceTest {

	@Test
	public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal(1000));
		
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Pedro", LocalDate.now(), new BigDecimal(1000));
		
		service.concederReajuste(funcionario, Desempenho.BOM);
		
		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Joao", LocalDate.now(), new BigDecimal(1000));
		
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
	}
}
