/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) 
	{
	 int x;
	 Scanner s= new Scanner(System.in);
	 System.out.println("check positive , negative or zero-");
	 System.out.println("enter value:");
	 x=s.nextInt();
	 
	 if(x>0)
	 {
	 	System.out.println("positive");
	 }
	 else if (x<0)
	 {
	 	System.out.println("negative");
	 }
	 else 
	 {
	 	System.out.println("zero");
	 }
	 
	}
}