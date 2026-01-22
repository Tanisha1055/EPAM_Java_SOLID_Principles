package org.child1.Design_Patterns.Structural.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        //This pattern basically helps us to make two different interface compatible with
        //one another, by wrapping the interface to the required type. Basically if an
        //interface works with one thing and we have a req of another, which we sort of
        //can build on top of one another, we use this pattern. Ex: we have a weight
        //interface which has an method to convert to pounds, so we might be having
        //a class which gives it's implementation of the method, but we req weight in kg,
        //so we can make another interface (which sort of wrappers around the first in the
        //sense that it has a method to create the req method , so in the implementation
        //of the wrapper interface by a class, we can define an obj of the prev interface
        //implementation, so we now have the access to the new interface method, so inside
        //that method's implementation, I can call the method of the prev interface by the
        //obj of the prev created and add some additional cal to convert it. So hence it
        //is wrapping the data , and providing additional functionality to convert from one
        //type to the other . So now if someone want wight in kg , i.e completely different
        //type and we have weight in pounds , we can make it adaptible by the wrapper interface.
        //So the new class has a "has-a" relationship with the prev class of the implementation.
        //In SpringBoot like we have the conversion of EntityToDTO and from DTOToEntity types
        //in order to make them compatible , is an good practical example of adapter pattern,
        //It's just that the adapter pattern uses interfaces to wrap the obj , so not exactly
        //the perfect example of this, but somewhat.

    }
}
