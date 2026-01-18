package org.child1.Design_Patterns.Creational.Singleton.Method2;


public class Singleton {
    private Singleton()
    {
        System.out.println("Singleton constructor");
    }
    public static class StaticInner{
        //so can be initialised once only
        //is of singleton type
        //(inner classes are not of outside classes(as methods are not of fully the
        //outside class)
        private static final Singleton Instance= new Singleton();
        public Singleton getInstance()
        {
            return StaticInner.Instance;
        }
    }
}
