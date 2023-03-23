package br.com.teste.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.modelo.tdd.Funcionario;
import br.com.service.tdd.BonusService;

public class BonusServiceTest {
	//Teste com assertThrows para testar exception no Junit
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		assertThrows( IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Pedro", LocalDate.now() , new BigDecimal("25000"))));
		
		
	}
	
	//Testar com Try/catch, forcando o erro
	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		try {
			service.calcularBonus(new Funcionario("Luciana", LocalDate.now(), new BigDecimal("2500")));
			fail("Nao deu a falha esperada.");
		} catch (Exception e) {
			assertEquals("Funcionário com salário maior que R$10000 não pode receber bonus!", e.getMessage());
			
		}
		
//		BonusService service = new BonusService();
//		BigDecimal bonus = service.calcularBonus(new Funcionario("Brendon", LocalDate.now(), new BigDecimal("2500")));
//		
//		assertEquals(new BigDecimal("250.00"), bonus);
	}
}
