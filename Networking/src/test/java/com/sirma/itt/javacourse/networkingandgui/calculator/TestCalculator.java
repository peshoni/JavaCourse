package com.sirma.itt.javacourse.networkingandgui.calculator;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

	@Test
	public final void testCreateMulltiplyInstance() {
		Calculator calculator = new Calculator();
		calculator.setOperator('*');
		Command command = calculator.prepareToExecute();
		Assert.assertTrue("Multiply".equals(command.getClass().getSimpleName()));
	}

	@Test
	public final void testCreateSumInstance() {
		Calculator calculator = new Calculator();
		calculator.setOperator('+');
		Command command = calculator.prepareToExecute();
		Assert.assertTrue("Sum".equals(command.getClass().getSimpleName()));
	}

	@Test
	public final void testCreateDivissionInstance() {
		Calculator calculator = new Calculator();
		calculator.setOperator('/');
		Command command = calculator.prepareToExecute();
		Assert.assertTrue("Division".equals(command.getClass().getSimpleName()));
	}

	@Test
	public final void testCreateSubtractInstance() {
		Calculator calculator = new Calculator();
		calculator.setOperator('-');
		Command command = calculator.prepareToExecute();
		Assert.assertTrue("Subtract".equals(command.getClass().getSimpleName()));
	}

	@Test
	public final void testSumMethod() {
		Calculator calculator = new Calculator();
		double firstOperand = 2;
		double secondOperand = 102;
		char operator = '+';
		calculator.setFirstOperand(firstOperand);
		calculator.setSecondOperand(secondOperand);
		calculator.setOperator(operator);
		calculator.prepareToExecute();
		double expected = 104;
		Assert.assertTrue(expected == calculator.execute());
	}

	@Test
	public final void testMultiplyMethod() {
		Calculator calculator = new Calculator();
		double firstOperand = 8;
		double secondOperand = 2.5d;
		char operator = '*';
		calculator.setFirstOperand(firstOperand);
		calculator.setFirstOperand(calculator.getFirstOperand());
		calculator.setSecondOperand(secondOperand);
		calculator.setSecondOperand(calculator.getSecondOperand());
		calculator.setOperator(operator);
		calculator.setOperator(calculator.getOperator());
		calculator.prepareToExecute();
		double expected = 20;
		Assert.assertTrue(expected == calculator.execute());
	}

	@Test
	public final void testDivisionMethod() {
		Calculator calculator = new Calculator();
		double firstOperand = 100;
		double secondOperand = 4;
		char operator = '/';
		calculator.setFirstOperand(firstOperand);
		calculator.setSecondOperand(secondOperand);
		calculator.setOperator(operator);
		calculator.prepareToExecute();
		calculator.execute();
		double expected = 25;
		Assert.assertTrue(expected == calculator.getResult());
	}

	@Test
	public final void testDivisionByZero() {
		Calculator calculator = new Calculator();
		double firstOperand = 100;
		double secondOperand = 0;
		char operator = '/';
		calculator.setFirstOperand(firstOperand);
		calculator.setSecondOperand(secondOperand);
		calculator.setOperator(operator);
		calculator.prepareToExecute();
		calculator.execute();
		String expected = "Infinity";
		Assert.assertTrue(expected.equals(String.valueOf(calculator.getResult())));
	}

	@Test
	public final void testSubstractMethod() {
		Calculator calculator = new Calculator();
		double firstOperand = 29;
		double secondOperand = 9;
		char operator = '-';
		calculator.setFirstOperand(firstOperand);
		calculator.setSecondOperand(secondOperand);
		calculator.setOperator(operator);
		calculator.prepareToExecute();
		double expected = 20;
		Assert.assertTrue(expected == calculator.execute());
	}

	@Test
	public final void testChangePositiveSign() {
		Calculator calculator = new Calculator();
		double operand = 29;
		double expected = -29;
		Assert.assertTrue(expected == calculator.changeSign(operand));
	}

	@Test
	public final void testChangeNegativeSign() {
		Calculator calculator = new Calculator();
		double operand = -29;
		double expected = 29;
		Assert.assertTrue(expected == calculator.changeSign(operand));
	}

	@Test
	public final void testChangeZeroSign() {
		Calculator calculator = new Calculator();
		double operand = 0;
		double expected = 0;
		Assert.assertTrue(expected == calculator.changeSign(operand));
	}
}
