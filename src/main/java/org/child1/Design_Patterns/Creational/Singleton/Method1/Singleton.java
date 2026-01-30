package org.child1.Design_Patterns.Creational.Singleton.Method1;

public class Singleton {
    //type of the obj is of class only as doesn't belong to any specific instance
    //as ensures only one instance of the class exists . (so the instance is of class
    //type.
    //Initialised to null intially.
    private static volatile Singleton obj=null;
    public static Singleton getInstance() {
        if (obj == null) {
            synchronized (Singleton.class) // specifies that obj of Singleton class
            {
                if (obj == null) {
                    return new Singleton();
                }
            }
        }
        return obj;
        //returns Singleton instance.
    }
}
