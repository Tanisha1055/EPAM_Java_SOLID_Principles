package org.child1.Design_Patterns.Behavioural.StragetyPattern;

public class SortContext {
    private SortStrategy sortstrat;
    void setSortstrat(SortStrategy strategy)
    {
        this.sortstrat=strategy;
    }
    void getSortedArray(int[] arr)
    {
        sortstrat.sort(arr);
    }
}
