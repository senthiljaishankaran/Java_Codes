package StrategyDesignPattern;

public class context {
    private Strategy strategy;
    public context(Strategy strategy){
        this.strategy=strategy;
    }
    public int executestrategy(int num1,int num2){
       return  strategy.doOperation(num1, num2);
    }
}
