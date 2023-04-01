package bank_driver;

import java.util.Scanner;

public class Bank {
   
	private double bal=5000;
	private int pwd;
	
	public void deposite(double money)
	{
		System.out.println("ENTER PASSWORD");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			bal=bal+money;
			System.out.println("deposite money: "+money);
			System.out.println("total balance :  "+bal);
		}
		else
		{
			System.out.println("incorrect password");
			
		}
	}
		public void withdraw(double money)
		{
			System.out.println("ENTER PASSWORD");
			Scanner s=new Scanner(System.in);
			pwd=s.nextInt();
			if(pwd==123)
			{
				bal=bal-money;
				System.out.println("withdraw money: "+money);
				System.out.println("total balance :  "+bal);
			}
			else
			{
				System.out.println(" incorrect password");
				
			}
		}
			public void checkbal(double money)
			{
				System.out.println("ENTER PASSWORD");
				Scanner s=new Scanner(System.in);
				pwd=s.nextInt();
				if(pwd==123)
				{
					System.out.println("total balance:  " +bal);
				}
				else
				{
					System.out.println(" incorrect password");
					
				}
	}
			

}
