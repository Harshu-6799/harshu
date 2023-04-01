package bank_driver;

import java.util.Scanner;



public class Customer {

	public static void main(String[] args) {
	
		 Bank b=new Bank();
		   int ch;
		   System.out.println("1.deposite");
		   System.out.println("2.withdraw");
		   System.out.println("3.checkbox");
		   
		   
		   System.out.println("enter your choise");
		   Scanner s2=new Scanner (System.in);
		   ch=s2.nextInt();
		   
		   switch(ch)
		   {
		   case 1: b.deposite(ch);
		   break;
		   case 2: b.withdraw(ch);
		   break;
		   case 3: b.checkbal(ch);
		   break;
		   default:
			   System.out.println(" Inlavid choise");
		   }
			}

}
