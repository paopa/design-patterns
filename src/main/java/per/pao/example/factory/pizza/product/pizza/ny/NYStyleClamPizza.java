package per.pao.example.factory.pizza.product.pizza.ny;

import per.pao.example.factory.pizza.factory.ingredient.PizzaIngredientFactory;
import per.pao.example.factory.pizza.product.pizza.base.ClamPizza;

public class NYStyleClamPizza extends ClamPizza {

    public NYStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }
}
