/**
 * Write a description of class TestScore here.
 *
 * @author (Karent Correa)
 * @version (2/14/2020)
 */
import java.util.Scanner;
 
public class TestScoresenhanced 
{
 
 public static void main(String[] args) 
 {
  Scanner stdIn = new Scanner(System.in);
  
  String firstName; // first name
  String lastName; // last name 
  String entry; // user's entry- enter q to quit
  
  
  double gradeA; // 100-90 A
  double gradeB; // 80-89 B
  double gradeC; // 70-79 C
  double gradeD; // 60-69 D
  double gradF; // 59-0 F
 


  System.out.println("Enter first name: ");
  firstName= stdIn.next();
  
  System.out.println("Enter last name: ");
  lastName= stdIn.next();
  AA
  
  System.out.println("Enter how many test scores you want to calculate: ");
    
  System.out.print("Other wise enter 'q' to quit: ");
  entry= stdIn.nextLine();
  
  if (entry.equals("q"))
  {
  System.out.println("stopped");
  }
  
  
  int numberofTests; 
  double totalScore=0;
  numberofTests=stdIn.nextInt();
  
  int a []=new int[numberofTests];
  System.out.println("enter "+numberofTests+" numbers");
  
  
  for(int i=0;i<numberofTests;i++)
  a[i]=stdIn.nextInt();
  
  for(int i=0;i<numberofTests;i++)
  totalScore=totalScore+a[i];
  
  if (totalScore/numberofTests>=90)
  {
   System.out.println("Your grade is an A!");
   
   }   
   else
   {
       if ((totalScore/numberofTests >= 80) && (totalScore/numberofTests <= 89))
       System.out.println("Your grade is a B!");
    }
          
  if ((totalScore/numberofTests >= 70) && (totalScore/numberofTests <= 79))
       System.out.println("Your grade is a C!");   
     
  if ((totalScore/numberofTests >= 60) && (totalScore/numberofTests <= 69))
       System.out.println("Your grade is a D!");   
    
  if ((totalScore/numberofTests >= 0) && (totalScore/numberofTests <= 59))
       System.out.println("Your grade is an F"); 
       
    
  
  System.out.println(firstName.charAt(0) + lastName);

   
  System.out.println("Your average score is: " + totalScore/numberofTests); 
  
 } // end main
 } // end class TestScoresenhanced

