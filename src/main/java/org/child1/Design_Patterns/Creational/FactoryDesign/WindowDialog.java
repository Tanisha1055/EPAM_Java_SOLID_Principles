package org.child1.Design_Patterns.Creational.FactoryDesign;

public class WindowDialog implements Dialog{
    @Override
    public void popUp() {
        System.out.println("Pop up");
    }

    @Override
    public void displayFont() {
        System.out.println("Display Font");
    }

    @Override
    public Button createObj() {
        return new WindowsObj();
    }
}
