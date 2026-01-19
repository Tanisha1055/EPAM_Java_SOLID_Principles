package org.child1.Design_Patterns.Structural.DecoratorPattern;

public class CoffeeDecorator implements Coffee{
    //we are making it protected as we will need the base class ref to access the
    //base class methods and add on top of it .
    protected Coffee decoratedCoffee;
    //this constructor is there to set the decorated kind of obj
    public CoffeeDecorator(Coffee c)
    {
        this.decoratedCoffee=c;
    }
    //calls the implemented decorated obj methods, that is calls the base simple coffee
    //class methods, in the decorator which when implemented by it's subclass will add
    //on to this . So this is the base class calling portion .
    //you need to instantiate the obj of base class , so that it gets set as the
    //decoratedCoffee feild and call it's getDescription , atleast that's how it is set.
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public int getCost() {
        return decoratedCoffee.getCost();
    }
}
