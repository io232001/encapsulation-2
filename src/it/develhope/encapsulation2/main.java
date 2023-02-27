package it.develhope.encapsulation2;
import java.text.DecimalFormat;
import java.util.Scanner;
public class main
{
    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        Person person = new Person(name, surname, height, age);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Name: " + person.getName());
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Height: " + df.format(person.getHeight()) + " m");
        System.out.println("Age: " + person.getAge());
    }
}
