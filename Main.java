import java.util.Scanner;

public class Main
{
  public static void main(String[] args)


  {
    Scanner sc = new Scanner(System.in);
    //Problem 1

    System.out.println("Problem 1\n");

    Circle circ1 = new Circle(10.1);
    Circle circ2 = new Circle(14.0);
    Circle circ3 = new Circle(20.5);

    System.out.println(circ1.toString() + "\n" + circ2.toString() + "\n" + circ3.toString());


    //Problem 2
    System.out.println("Problem 2\n");
    
    double lenWid;
    double len;
    double wid;
    Rectangle rect1;
    Rectangle rect2;

    System.out.println("Enter a number for length and width:");
    lenWid = sc.nextDouble();

    System.out.println("Type a length:");
    len = sc.nextDouble();

    System.out.println("Type a width:");
    wid = sc.nextDouble();

    rect1 = new Rectangle(lenWid);
    rect2 = new Rectangle(len, wid);

    System.out.println(rect1.toString() + "\n" + rect2.toString());

    //Problem 3
    System.out.println("Problem 2\n");

    double side;
    RegularPolygon rp1;
    RegularPolygon rp2;
    System.out.println("Enter a side length:");
    side = sc.nextDouble();

    rp1 = new RegularPolygon(side);
    rp2 = new RegularPolygon(4,side);

    System.out.println(rp1.toString() + "\n" + rp2.toString());

  }
}
