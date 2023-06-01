package OOPs;

public class Constructor {
	int id;
	String CourseName;
	String Unit;
	
	void CourseInfo(int id, String CourseName, String Unit)
	{
		this.id =id;
		this.CourseName=CourseName;
		this.Unit=Unit;
		
		System.out.println("person one :-\n");
		System.out.println("Course Name : "+CourseName);
		System.out.println("Course Id : "+id);
		System.out.println("Course Unit : "+Unit+"\n");
	}
	void info()
	{
		System.out.println("person Second :-\n");
		System.out.println("IT Course Name : "+CourseName);
		System.out.println("IT Course Id : "+id);
		System.out.println("IT Course Unit : "+Unit);
	}

	public static void main(String[] args) {
		
		Constructor course=new Constructor();{
			course.CourseInfo(101,"javase","variable");
			course.info();
		}
		

	}

}
