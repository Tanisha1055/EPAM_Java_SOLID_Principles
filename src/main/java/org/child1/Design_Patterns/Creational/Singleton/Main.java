package org.child1.Design_Patterns.Creational.Singleton;

public class Main {
    public static void main(String[] args) {
        //This ensures that only single instance of class exists and it is globally
        //accessible , without getting affected in multithreading environment.
        //for that we create a private static instance of it, make the constructor
        //as private (so that no outside class can access it), and make a getInstance
        //method, which checks whether the instance is null (not prev created )
        //then make a new instance (when new keyword is used only then constructor
        //is called), otherwise return the instance. This ensures that only 1 db
        //connection is there (as an example). And we need to make the getInstance
        //in example1 as static as otherwise to access that method only we would need
        //to create obj of the class, but we know only 1 obj can exist, so for that we
        //need to make it static, hence the instance variable is also static and volatile
        //volatile as the change should be visible to all the threads, or that thread may
        //not see and start working with half initialised state ,as in case it sees that
        //it is not null (but not fully constructed), or the situation may arise that it
        //still sees it as null and try to get inside the synchronised block again and again
        //which is time consuming , we have placed the synchronised block to ensure thread
        //safety but the synchronised block makes the thread wait , as puts lock on the
        //thread accessing it. But with the help of volatile we can ensure that the rest
        //of threads sees that the instance is not null and doesn't go near the synchronised
        //block in the first place. Inside the synchronised block also we have places the not
        //null condition as , if there is a possibility that 2 threads consecutively access the
        //synchronised block and initialised before the other, so inside also we need to check
        //whether it is still null or not, then do the logic. For the method 2 of creating
        // a singleton class, we need to make static inner class , as static inner class is
        //loaded at the time of initialisation (reference), jvm does that automatically for
        //performance improvement. So the inisde we can keep the instance variavle to be
        //final ,so thatonly once it can be initialised , and the getInstance method would
        // only return trhat instance, we need static class for sure , not to do obj creation
        // and to keep the instance avriable, and static , classes are inner classes . So hence
        //that.
    }
}
