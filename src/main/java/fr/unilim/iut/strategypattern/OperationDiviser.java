package fr.unilim.iut.strategypattern;

public class OperationDiviser implements Strategy{
	 @Override
	   public int faireOperation(int num1, int num2) {
	      return num1 / num2;
	   }
}



