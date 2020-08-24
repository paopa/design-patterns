package per.pao.example.decorator.coffee;

import per.pao.example.decorator.base.Beverage;
import per.pao.example.decorator.base.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
