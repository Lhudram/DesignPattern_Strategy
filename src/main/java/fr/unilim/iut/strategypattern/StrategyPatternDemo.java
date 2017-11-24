package fr.unilim.iut.strategypattern;

public class StrategyPatternDemo {
	
	public static void main(String[] args) {
		
		Context context = new Context(new OperationAjouter());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSoustraire());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiplier());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationDiviser());
		System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
	}
}



