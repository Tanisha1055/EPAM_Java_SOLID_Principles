package org.child1.S.O.L.I.D_Principles.L.Liskov_Substitution;

public class Main {
    public static void main(String[] args) {
        //it says that the base class should be completely substitutable with it's subclass
        //makes sense also as for that the subclass should be a extension of base class
        //so if a subclass isn't implementing the existing behaviours of the base then the
        //base class should be changed to make it more flexible (generic)
        //so for example if I have a car as base class(interface), and I have subclasses
        //as a automatic car and electric car. And I have a property as engine,so that
        //would be a problem for automatic car as the automatic car have engine , but electric
        //car don't. So for setEngine() func in electric car, we would be throwing an error,
        //but that is not a good practice (it affects extension and introduces lot of bugs),
        //on the other hand , I shouldn't have included engine as a property of Car base class
        //in the first place .



    }
}
