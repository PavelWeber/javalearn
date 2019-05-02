package ru.stqa.pft.sandbox;

public class myfirstprogram {

    public static void main(String []args)

    {


        Hello(" " + "John");
        Hello(" " +"Ivan");

        Square s = new Square(5);



        System.out.println("Square is " + s.area());


        Rectangle m = new Rectangle(54,67);



        System.out.println("Square rectangle=  "+m.area());




    }

    public static void Hello(String somebody)

    {

        System.out.println("Hi"+somebody);
    }





}
