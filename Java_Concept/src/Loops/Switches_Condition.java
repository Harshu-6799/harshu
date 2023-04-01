package Loops;

import java.util.Scanner;

public class Switches_Condition {

	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("plase enter to check consonent or vowels");
		char check=s.next().charAt(0);
		
		switch(check)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		{
			System.out.println("its a vowels");
		}
		default:
		{
			System.out.println("its a consonent");
		}
		}

	
	}

}
