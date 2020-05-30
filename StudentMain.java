package AveGrade;

import java.util.Scanner;

public class StudentMain {
	public static Student getStudentDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		int nosub;int marks[];String name;
		System.out.println("Enter the name:");
		 name = sc.nextLine();
		 sc.nextLine();
		System.out.println("Enter the no of subjects:");
		int flag =0;
		do {
		 nosub  = sc.nextInt();
		flag = 1;
		if( nosub<=0)
		{
			System.out.println("Invalid number of subject");
			flag =0;
		}
		}	while(flag == 0);
		marks = new int[nosub];
		for(int i=1;i<=nosub;i++) {
			System.out.println("Enter mark for subject " + i);
			 
			int flag1 =0;
			do {
			 marks[i-1] = sc.nextInt();
			flag1 = 1;
			if( marks[i-1]<0 || marks[i-1] >100)
			{
				System.out.println("Invalid Mark");
				flag =0;
			}
			}	while(flag1 == 0);
			

		}
		
		Student s= new Student(id,name,marks);
		
		return s;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = getStudentDetails();
		
		s1.calculateAvg();
		s1.findGrade();
		
		System.out.println("Id:" + s1.getId());
		System.out.println("Name:"+s1.getname());
		System.out.println("Average:" + s1.getaverage());
		System.out.println("Grade:"+s1.getgrade());
	}

}
