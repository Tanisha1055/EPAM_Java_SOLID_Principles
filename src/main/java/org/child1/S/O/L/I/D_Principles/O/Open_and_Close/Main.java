package org.child1.S.O.L.I.D_Principles.O.Open_and_Close;

public class Main {
    public static void main(String[] args) {
        //In this is says that a class should be open for extension but closed for modification
        //as addition of additional functionality would break the already written unit test cases
        //(as test cases are written keeping certain conditions and checks to be made and addition
        //of extra would req to handle more edge cases)
        //to achieve that we can use interface as then when we have to extend certain functionality
        //we just add in the overridden method of the interface, and decide which to implement
        //for the class.Also at runtime we can dynamically decide which one to run, which version
        //you can create a new class that extends the same interface and overridden the method
        //you want to extend . This way we can (dynamically) use dependency injection at runtime time
        //to control when this new class is used . (by decorator pattern)
        //you can only use this approach if the method is both public and included in the interface
    }
}
