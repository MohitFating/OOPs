package OOPs;

class Client1
{
	int multiply(int a,int b)
	{
		return a*b;
	}
	int multiply(double a,double b)
	{
		return (int) (a * b);
	}
}

public class MethodOverLoading {

	public static void main(String[] args)
	{
		Client1 client = new Client1();
		System.out.println(client.multiply(2, 35));
		System.out.println(client.multiply(12.8f, 35.6f));

	}

}
