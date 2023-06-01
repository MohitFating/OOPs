package OOPs;

public class Method {
	
	//  Non Return type and Non Arguments
	
	void info1()
	{
		System.out.println("My Name is Mohit Fating");
	}
	
    //  Non Return type and with Arguments
	
	void info2(String Text)
	{
		System.out.println("My Name is Mohit Fating"+Text);
	}

	// With Return type and Non Arguments
	
	String name()
	{
		return "Mr_Wick";
	}
	int age()
	{
	 return 57;
	}
	float height()
	{
		return 4.5f;
	}
	
	// With Return type And With Arguments
	
	int tax(int price , int gst)
	{
		gst=(price*gst)/100;
		
		price=price+gst;
		
		return price;
	}
	
	public static void main(String[] args) {
	
	    //  Non Return type and Non Arguments
		System.out.println("\n 1 . Non Return type and Non Arguments \n");
		
		Method obj =new Method();
		obj.info1();     
		
		//  Non Return type and with Arguments
		System.out.println("\n 2 . Non Return type and with Arguments \n");
		
		obj.info2(" Is Java Coder");        
		
		// With Return type and Non Arguments
		System.out.println("\n 3 . With Return type and Non Arguments \n");
		
		System.out.println("My Name is "+obj.name());
		System.out.println("My Age is "+obj.age());
		System.out.println("My Height is "+obj.height());
		
		// With Return type And With Arguments
		System.out.println("\n 4 . With Return type And With Arguments \n");
		
		System.out.println("This is MRP : "+obj.tax(1000, 10));
		
		
		

	}

}
