package fr.unilim.iut.strategypattern;

public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.faireOperation(num1, num2);
   }
}



