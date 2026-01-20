package org.child1.Design_Patterns.Creational.Singleton.Method4;

//Eager Intialisation
//When the class is getting loaded then only creating obj
//Beforehand creation of obj, even before it is actually needed or not
public class Singleton {
    //here only we are creating the obj , beforehand only, irrespective of the fact it
    //is needed or not and it is static so class-level loading
    //So now whenever getInstance is called it is returning this obj only.
    //we are still making the constructor as private as outside world should not be able
    //to create the obj of it, and internally we will be using that to create new obj of
    //it. As internally we req so we need to create constructor.
    private static Singleton obj=new Singleton();
    private Singleton(){};
    public static Singleton getInstance()
    {
        return obj;
    }

}
