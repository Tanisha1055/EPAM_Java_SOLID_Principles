package org.child1.S.O.L.I.D_Principles.L.Liskov_Substitution;

public class Automatic_Car implements Car{
    @Override
    public void startEngine()
    {
        System.out.println("Start engine");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate");
    }
}
