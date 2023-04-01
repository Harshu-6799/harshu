package bagdriver;



public class Calculator {

	  int a=10;
	   int b=20;
	   float c;
	   
	   
	   public void add()
	   {
		   c=a+b;
		   System.out.println(c);
	   }
	   
	   public void sub()
	   {
		   c=a-b;
		   System.out.println(c);
	   }
	   
	   public void div()
	   {
		   c=a/b;
		   System.out.println(c);
	   }
	   
	   public void mul()
	   {
		   c=a*b;
		   System.out.println(c);
	   }
	   public static void main(String[]arg)
	   {
		  Calculator c=new Calculator();
		  
		   c.add();
		   c.sub();
		   c.mul();
		   c.div();
		   
		   
	   }
}