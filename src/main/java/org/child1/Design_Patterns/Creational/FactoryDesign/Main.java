package org.child1.Design_Patterns.Creational.FactoryDesign;

public class Main {
    public static void main(String[] args) {
        //This provides an interface for subclasses to implement, but the subclasses can
        //alter the type of obj created. So it(the base interface) provides the generalised
        //category of obj creation construction in the interface. Then implementing class
        //can provide the type of obj created and the specific implementation of that type.
        //So the interface needs to have normal method for the basic obj performance (the
        //obj have to be of some specific category, to have some common kind of behaviour)
        //so the job of the interface is not just obj creation. Here the interface provides
        //just methods as interface can't be responsible for obj creation, but only methods.
        //So one method can be of Createobj, and the rest implying obj properties. The return
        //type of the createobj can be the interface of the obj (separately specified to have
        //other properties, as the base interface class can be doing some other logic
        //generation other than, the sole obj related properties, so the obj interface will
        //have obj specific properties. Now when the subclass would implement the base
        //interface, in the createobj property it would return that specific obj for which
        //it was designed, by creating new, instance of that specific obj . And that new
        //instance of specific obj created, implements the base obj interface, that is why
        //it is of it's kind . So another implementation of base interface obj exists as
        //the specific obj created , which can access the base obj properties. So there are
        //2 base interfaces, and mul obj classes can be created to implement those, to the
        //specified obj type . So the base interface performs various logic of the entire
        //component and also helps to create obj of specified type) having it as return type
        //and forcing subclasses to create new instance of it). (The return type if of parent
        //interface , but child class , IS-A interface (already included).

        }

}
