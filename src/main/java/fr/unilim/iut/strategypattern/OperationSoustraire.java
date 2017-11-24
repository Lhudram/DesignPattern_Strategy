package fr.unilim.iut.strategypattern;

public class OperationSoustraire implements Strategy {
	@Override
	public int faireOperation(int num1, int num2) {
		return num1 - num2;
	}
}





