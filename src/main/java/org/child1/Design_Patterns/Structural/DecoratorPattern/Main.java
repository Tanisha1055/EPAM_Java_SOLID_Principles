package org.child1.Design_Patterns.Structural.DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        //Let's you attach new behaviours to these objects, by placing these objects
        //inside special wrapper objects , that contain te behaviour .
        //See the Open/Close Principle of Solid Principles Package. There an example of
        //this has been provided.
        //In this , it's like factory pattern, difference comes when the subclass ,
        //extending the base decorator class(the class which wraps up the base obj interface
        //and provides the obj of interface type as the field to be  dynamically set ,and
        //a constructor to do so , as well as providing basic implementation of the interface
        // methods), provides extra features to it's subclass objects , unlike factory which
        //only specified type of obj created at runtime . When we say new features we are
        //not adding new methods in the subclasses , we are defining more specification in
        //the already defined methods , like in case of coffee , we can specify to add it
        //with milk other than normal coffee , also mention sugar , on top addition of
        //hazelnut creamer as well . But I can't add pizza with that , that is a separate
        //entity other than the base coffee class . And we can't do coffee with handle and
        //without handle , our work ios just to define our order coffee . We are doing the
        //specification by wrapping in the individual decorator , like milk decorator, and
        //sugar decorator which provides specification to the same existing methods,to do
        //some more work .
        //Factory Pattern - type of obj;
        //Decorator Pattern - type of obj + Extra Features

        //so here we have passed the new Simple Coffee as the arg so it will get
        //initialised by the super keyword .
        // and the rest getDescription will be getting added on .
        MilkDecorator milkdec=new MilkDecorator(new SimpleCoffee());
        milkdec.getDescription();
    }
}
