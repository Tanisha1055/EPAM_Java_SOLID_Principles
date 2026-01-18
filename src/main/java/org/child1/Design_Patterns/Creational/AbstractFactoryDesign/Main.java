package org.child1.Design_Patterns.Creational.AbstractFactoryDesign;

public class Main {
    public static void main(String[] args) {
        //This provides creation of families of related objects without specifying their
        //concrete classes. Now family in the sense ,when we say furniture, we include
        //sofa ,table and carpet. Now we have 3 obj included in this, can be of various type
        //like victorian, modern, and art decor etc. So need their specific implementation.
        //Now I can create 3 base obj as interfaces, and the base interface of furniture
        //would have methods to create them . And the subclasses of that type would specify
        //that . So this is made up of multiple (many) factory design methods .
    }
}
