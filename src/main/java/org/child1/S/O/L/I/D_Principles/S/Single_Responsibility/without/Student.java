package org.child1.S.O.L.I.D_Principles.S.Single_Responsibility.without;

public class Student {
    private String name;
    private int age;
    private int rollnum;
    private int savestu;
    private String coursestu;
    public void save(Student s)
    {
        savestu++;
    }
    public void Enroll(String c)
    {
        this.coursestu=c;
    }
    public void Email(Student s)
    {
        System.out.println("Sending Email to this student");
    }
    //so here we are having multiple different fucntionality inside one class
    //which is not recommended
}
