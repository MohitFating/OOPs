package Java;

class Author
{
	void book()
	{
		System.out.println("The Book Of Five Rings");
	}
}
class Writer extends Author
{
	void book()
	{
		super.book();
		System.out.println("Miyamoto Mushashi");
	}
}
public class SuperKey {
	public void main(String[] arg)
	{
		Writer wr = new Writer();
		wr.book();
	}

}
