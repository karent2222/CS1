
/**
 * Write a description of class AreaCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
 
public class AreaCalculator
{
 
 public static void main(String[] args) 
 {
 
  Scanner stdIn= new Scanner (System.in);
  
  System.out.println ("Choose the type of shape to find the area");
  System.out.println ("\t1. Rectangle");
  System.out.println ("\t2. Square");
  System.out.println ("\t3. Triangle");
  System.out.println ("\t4. Circle");
  System.out.println ("\t5. Rhombus");
  System.out.println ("\t6. quit");
  
      
      int option=stdIn.nextInt();
    if(option==1)
    {
        System.out.println("Enter the dimentions of the rectangle");
        int width=stdIn.nextInt();
        int length=stdIn.nextInt();
        double area=width*length;
        System.out.println("The area of the rectangle is " + area);
    }
    else if(option==2)
    {
     
        System.out.println("Enter the dimentions of the square");
        int side1=stdIn.nextInt();
        int side2=stdIn.nextInt();
        double area=side1*side2;
        System.out.println("The area of the square is " + area);
    }
    else if(option==3)
    {
        System.out.println("Enter the dimentions of the triangle");
        
        int base=stdIn.nextInt();
        int height=stdIn.nextInt();
        double area=0.5*(base*height);
        System.out.println("The area of the triangle is " + area);
    }
    else if (option==4)
    {
        System.out.println("Enter the dimentions of the circle");
        double PI=3.142;
        int radius=stdIn.nextInt();
        double area=PI*radius*radius; 
        System.out.println("The area of the circle is " + area);
    }
    else if (option==5)
    {
     System.out.println("Enter the dimentions of the rhombus");
        
        int side1=stdIn.nextInt();
        int side2=stdIn.nextInt();
        double area=(side1*2) + (side2 *2);
        System.out.println("The area of the rhombus is " + area);  
    }
    else if (option==6)
    {
        System.out.print("Enter '6' to quit: ");
    }
               
       
    }
        

    }
      

