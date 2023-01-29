package it.develhope.encapsulation2;

public class main
{
    public static void main (String args[])
    {
        Person p1 = new Person();
        p1.age=20;
        p1.height=1.88;
        p1.name="Mario";
        p1.surname="Rossi";
        System.out.println(p1.toString());
    }
}
