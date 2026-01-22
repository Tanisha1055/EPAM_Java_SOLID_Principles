package org.child1.Design_Patterns.Structural.AdapterPattern;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine machine;
    @Override
    public double getWeightInKgs() {
        machine=new WeightMachineImpl();
        return machine.weightInPounds()*4.5;
    }
}
