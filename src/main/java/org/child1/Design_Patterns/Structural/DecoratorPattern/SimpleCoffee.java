package org.child1.Design_Patterns.Structural.DecoratorPattern;

public class SimpleCoffee implements Coffee{
    // it is the simple class which the wrapper class is gonna call and add features in
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public int getCost() {
        return 5;
    }
}
