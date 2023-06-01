package OOPs;

//String builder program

public class StringBuilder {
	

	public static void main(String[] args)
	{
	
       StringBuffer sb = new StringBuffer("Mohit");
       System.out.println(sb);
       
       sb.append(" Fating");
       System.out.println(sb);
       
       sb.insert(5, " Bhimrao");
       System.out.println(sb);
       
       sb.replace(0, 5, "Lalita");
       System.out.println(sb);
       
       sb.delete(6, 14);
       System.out.println(sb);
       
       sb.reverse();
       System.out.println(sb);

	}

}
