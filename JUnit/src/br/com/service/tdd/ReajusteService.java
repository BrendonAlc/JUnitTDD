package br.com.service.tdd;

import java.math.BigDecimal;

import br.com.modelo.tdd.Desempenho;
import br.com.modelo.tdd.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
		//Utilizando padrao Estrategy no desempenho para reajustar
		BigDecimal percentual = desempenho.percentualReajuste();
		BigDecimal reajuste = funcionario.getSalario().multiply(percentual);
		funcionario.reajustarSalario(reajuste);

	}
}
