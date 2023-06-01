package OOPs;

class Client
{
String Name;
void getName()
{
	System.out.println("My Name is : "+Name);
}
}

public class Objects {
	
	public static void main(String[] args)  
	
	{
		 //create object
		
	  Client obj=new Client();
	  
	  obj.Name="Mohit";
	  obj.getName();
	  obj.Name="Kedar";
	  obj.getName();
	 

	}

}
