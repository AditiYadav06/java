/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aditi Yadav
 */
import java.util.Scanner;
class OddOEvenprogram
{
  public static void main(String args[])
  {
    int a;
    System.out.println("Enter a number");
    Scanner in = new Scanner(System.in);
    a= in.nextInt();

    if (a % 2 == 0)
      System.out.println("The number is even.");
    else
      System.out.println("The number is odd.");
  }
}
