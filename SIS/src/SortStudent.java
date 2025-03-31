import java.util.ArrayList;
import java.util.Collections;

public class SortStudent 
{
	public static ArrayList<Student> sortByLastName()
	{
		ArrayList <Student> sorted = new ArrayList <Student>();
		
		for(Student s: SIS.roster)
		{
			sorted.add(s);
		}
		
		Collections.sort(sorted, new LastNameSort());
		return sorted;

	}
	

	public static ArrayList<Student> sortByPeriod1()
	{
		ArrayList <Student> sortedBy1 = new ArrayList <Student>();
		
		
		for(Student s: SIS.roster)
		{
			sortedBy1.add(s);
		}
		
		Collections.sort(sortedBy1, new Period1Sort());
		
		return sortedBy1;

	public static void sortByPeriod()
	{
		System.out.println("Which period do you want to sort by? 1, 2, or 3?");
		System.out.println("1, 2, or 3");
		
		int choice= SIS.user.nextInt();
		if (choice ==1)

			{
				//period 1 sort
				
			}
		else if (choice ==2)

			{
				//period 2 sort
				
			}
		else if (choice ==3)
		{
				// period 3 sort
		}
	}
	
	public static ArrayList<Student> sortByPeriod1()
	{
		ArrayList <Student> sortedPeriod1 = new ArrayList <Student>();
		
		for (Student s: SIS.roster)
		{
			sortedPeriod1.add(s);
		}
		
		Collections.sort(sortedPeriod1, new SortingPeriod1());
		return sortedPeriod1;
		

	}
	
	
}
