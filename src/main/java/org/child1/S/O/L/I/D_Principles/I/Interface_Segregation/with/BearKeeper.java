package org.child1.S.O.L.I.D_Principles.I.Interface_Segregation.with;


public class BearKeeper implements BearFeed,BearWash {
    @Override
    public void bearWash() {
        System.out.println("Bear Washing");
    }

    @Override
    public void bearFeed() {
        System.out.println("Bear Feeding");
    }

    //only implementing the req ones
}
