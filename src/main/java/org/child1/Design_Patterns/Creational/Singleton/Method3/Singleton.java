package org.child1.Design_Patterns.Creational.Singleton.Method3;

//Lazy-Intialisation
//get obj created only when getInstance() method is called
public class Singleton {
    private static Singleton obj;
    private Singleton(){};
    public static Singleton getInstance()
    {
        if(obj==null)
            obj=new Singleton();
        return obj;
    }
}
