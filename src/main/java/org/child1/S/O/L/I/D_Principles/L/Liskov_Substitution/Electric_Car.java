package org.child1.S.O.L.I.D_Principles.L.Liskov_Substitution;

public class Electric_Car implements Car {
    //class doesn't throw exception , methods and constructor does
    @Override
    public void startEngine() throws IllegalArgumentException
    {
        throw new IllegalArgumentException("Can't have engine");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate");
    }
}
