package org.child1.Design_Patterns.Structural.DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator{
       public MilkDecorator(Coffee coffee)
       {
           //from the base class in it;s arg it will call super on it .
           //given the base class to get initialised by it
           super(coffee);
       }

    @Override
    public String getDescription() {
           //adding more specifications or details
        return super.getDescription()+", Milk";
    }

    @Override
    public int getCost() {
        return super.getCost()+2;
    }
}
