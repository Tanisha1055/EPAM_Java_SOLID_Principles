package org.child1.S.O.L.I.D_Principles.I.Interface_Segregation.without;

public class BearKeeper implements Bearthings{
    @Override
    public void bearWash() {
        System.out.println("Bear Washing");
    }

    @Override
    public void bearFeed() {
        System.out.println("Bear Feeding");
    }
    //Forcing to implement this method even when not req
    @Override
    public void bearShow() {
       throw new IllegalArgumentException("This doesn't conduct that");
    }
}
