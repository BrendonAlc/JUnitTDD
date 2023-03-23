package br.com.teste.tdd;

import org.junit.jupiter.api.Test;

import br.com.modelo.tdd.Calculadora;
import junit.framework.Assert;

public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar(3, 7);

		Assert.assertEquals(10, soma);

	}

	@Test
	public void deveriaSomarDoisNumerosNegativos() {
		Calculadora calc1 = new Calculadora();
		int soma1 = calc1.somar(-7, -4);
		Assert.assertEquals(-11, soma1);
	}

}
