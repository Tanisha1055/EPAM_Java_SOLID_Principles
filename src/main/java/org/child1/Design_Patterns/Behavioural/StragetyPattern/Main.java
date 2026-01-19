package org.child1.Design_Patterns.Behavioural.StragetyPattern;

public class Main {
    public static void main(String[] args) {
        //In this it provides different strategies to implement the same kind of
        //method, in the base class, so it groups different kinds of (similar)
        //algorithms, so that they can be used interchangebly. Like if you want to get
        //sorting in your code algorithm, you can choose which sorting also to use from
        //mergesort, quicksort, bubblesort etc.
        //so the difference from the factory method comes that, in the factory method
        //we were concerned with providing the dynamic behaviour regarding the obj creation
        //but here we are concerned with providing dynamic behaviour regarding method
        //implementation, like the same obj wants to implement, travel by road, now it
        //wants to implement travel by cycle.
        //so I will create interface of implementation of method, and make different method
        //implement it. Instead of defining them in the class (making it tight coupling), I
        //will have object of it, which will get dynamically alloted.

        int[]  data={1,2,3,4,5};
        SortContext sortc=new SortContext();
        //sets up the type of method algo to be implemented
        sortc.setSortstrat(new BubbleSort());
        sortc.getSortedArray(data);
    }
}
