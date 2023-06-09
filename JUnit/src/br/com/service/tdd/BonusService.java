package br.com.service.tdd;

import java.math.BigDecimal;
import br.com.modelo.tdd.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionário com salário maior que R$10000 não pode receber bonus!");
		}
		return valor;
	}

}
