package StrategyDesignPattern;

public class client {
    public static void main(String[] args) {
        context con = new context(new Add());
        int value = con.executestrategy(5, 4);
        System.out.println(value);
    }
}
