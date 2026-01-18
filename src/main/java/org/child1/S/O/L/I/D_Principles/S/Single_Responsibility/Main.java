package org.child1.S.O.L.I.D_Principles.S.Single_Responsibility;

public class Main {
    public static void main(String[] args) {
        //This Single-Responsibility says that a Class should be responsible to perform
        //only a single thing and it should have a single reason to change
        //as having multiple logic meaning , and we would have multiple
        // developers having to work on the same file , which would induce a lot of bug
        // and require to write a lot of tests , further more , while commiting to git
        // it might introduce merge conflict as multiple developers might add code in
        // the same line , which might not match with the prev logic and if  it would
        // have been single responsibility we would know which one to keep , as the new
        // latest one just adds to the logic, but with multiple different function we
        // would have multiple valid logic so we can't substitute one in place of another


    }
}
