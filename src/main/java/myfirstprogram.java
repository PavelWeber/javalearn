package main.java;

public class myfirstprogram {

    public static void main(String []args)

    {


        Hello(" " + "John");
        Hello(" " +"Ivan");
        

        double l = 5;

        System.out.println("Square is " + area(l));

        double barb = 5.6;

        System.out.println("Square rectangle=  "+area(barb,2));




    }

    public static void Hello(String somebody)

    {

        System.out.println("Hi"+somebody);
    }


    public static double area (double len)

    {

        return len*len;
    }

    public static double area (double len, double b)

    {

        return len*b;
    }
}
