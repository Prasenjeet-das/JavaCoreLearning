import java.util.Scanner;
class GradeProgram
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the marks");
		int marks =sc.nextInt();
		if (marks >= 90)
		{
		System.out.println("grade A");	
		}
		
		else if(marks>=75 && marks <=89)
		{
		System.out.println("grade B");
		}
		else if(marks>=60 && marks <=79)
		{
			System.out.println("grade C");	
		}
		else if(marks>=35 && marks <=59)
		{
			System.out.println("grade D");	
		}	
		else {
			System.out.println("grade F");
		}
	}
	
	
}