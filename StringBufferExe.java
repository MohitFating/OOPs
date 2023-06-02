package OOPs;

public class StringBufferExe {

	public static void main(String[] args) 
	
	{
		
		StringBuffer obj = new StringBuffer("String Buffer Type\n");
		System.out.println(obj);
		
		obj.append("1 . Append\n");
		System.out.println(obj);
		
		obj.insert(19, "2 . Insert\n");
		System.out.println(obj);
		
		obj.replace(19, 29,"3 . Replace");
		System.out.println(obj);
		
		obj.delete(18, 41);
		System.out.println(obj);
		
		System.out.println("-----Reverse Order-----");
		obj.reverse();
		System.out.println(obj);
		
		String a="Normal String\n";
		System.out.println(a);
		

	}

}
