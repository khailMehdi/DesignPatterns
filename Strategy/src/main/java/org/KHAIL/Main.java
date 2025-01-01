package org.KHAIL;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyImpl1());
        context.perform();
        context.setStrategy(new StrategyImpl2());
        context.perform();
        context.setStrategy(new StrategyImpl3());
        context.perform();
    }
}