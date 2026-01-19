package org.child1.Design_Patterns.Structural.DecoratorPattern;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee)
    {
        //from the base class in it;s arg it will call super on it .
        //given the base class to get initialised by it
        super(coffee);
    }

    @Override
    public String getDescription() {
        //adding more specifications or details
        return super.getDescription()+", Sugar";
    }

    @Override
    public int getCost() {
        return super.getCost()+1;
    }
}
