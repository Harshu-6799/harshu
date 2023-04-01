package bagdriver;

public class bagdriven {
	public static void main(String[]arg)
	{
		bag b=new bag ();
		System.out.println("..........");
		
		
		b.setColour ("blacl");
		b.setBrand ("puma");
		b.setPrice (1000);
		
		
		System.out.println(".........");
		
		System.out.println(b.getBrand());
		System.out.println(b.getColour());
		System.out.println(b.getPrice());
		
	}

}
