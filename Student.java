package AveGrade;

public class Student {

	private int id;
	private String name;
	private int marks[];
	private float average;
	private char grade;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	public String getname()
	{
		return this.name;
	}
	
	public void setmarks(int marks[])
	{
		for(int i = 0 ; i<marks.length; i++)
		{
		this.marks[i] = marks[i];
		}
	}
	public int[] getmarks()
	{
		return this.marks;
	}
	
	public void setaverage(float average)
	{
		this.average = average;
	}
	public float getaverage()
	{
		return this.average;
	}
	public void setgrade(char grade)
	{
		this.grade = grade;
	}
	public char getgrade()
	{
		return this.grade;
	}
	
	public Student(int id, String name, int[] marks)
	{
		
		this.id = id;
		this.name = name;
		for(int i = 0 ; i<marks.length; i++)
		{
		this.marks[i] = marks[i];
		}
	}
	
	public void calculateAvg()
	{
		int sum = 0;
		for(int i = 0 ; i<marks.length; i++)
		{
		sum = sum + marks[i];
		}
		average = sum/marks.length;
		this.setaverage(average);
	}
	
	public void findGrade()
	{
		if(this.getaverage()<50)
		{
			this.setgrade('F');
			
		}
		else if(this.getaverage()>=50 || this.getaverage() < 80)
		{
			this.setgrade('A');
		}
		else if(this.getaverage()>=80 || this.getaverage() <= 100)
		{
			this.setgrade('O');
		}
	}
}
