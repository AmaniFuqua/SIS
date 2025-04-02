import java.util.ArrayList;
import java.util.Scanner;

public class ChangeSchedulesOrGrades
	{
		
		public static Scanner user= new Scanner (System.in);
		public static void pick()
		{
		System.out.println("Pick one");
		System.out.println("1) Change grade");
		System.out.println("2) Change schedule");
		int changeGrad= SIS.user.nextInt();
		if ( changeGrad==1)
			{
				changeGrade();
			}
		else if ( changeGrad==2)
			{
				changeSchedule();
			}
		else
			{
				System.out.println("Error, please try again");
			 changeGrad=user.nextInt();
			}
		}
		
		public static void changeGrade()
		{
			//GpaCalculator.Calc();
			System.out.println();
		System.out.println("Which student's grades would you like to change?");
		int num=0;
		for (Student k : SIS.roster)
			{
				num++;
				System.out.println(num+") "+k.getFirstName()+ " "+ k.getLastName() + " " +  k.getGpa()+  " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());
			}
		int p = user.nextInt();
		p--; 
		System.out.println();
		System.out.println("1)"+ SIS.roster.get(p).getPeriod1() +": "+SIS.roster.get(p).getGrade1() );
		System.out.println("2)"+ SIS.roster.get(p).getPeriod2() +": "+SIS.roster.get(p).getGrade2() );
		System.out.println("3)"+ SIS.roster.get(p).getPeriod3() +": "+SIS.roster.get(p).getGrade3() );
		System.out.println();
		System.out.println("Which class?");
		int c= user.nextInt();
		if (c==1)
			{
				System.out.println();
				System.out.println("What would you like the grade to be?");
				String g=user.next();
				SIS.roster.get(p).setGrade1(g);
				System.out.println(SIS.roster.get(p).getPeriod1() +": "+SIS.roster.get(p).getGrade1());
			}
		else if (c==2)
			{
				System.out.println();
				System.out.println("What would you like the grade to be?");
				String g=user.next();
				SIS.roster.get(p).setGrade2(g);
				System.out.println(SIS.roster.get(p).getPeriod2() +": "+SIS.roster.get(p).getGrade2());
			}
		else if (c==3)
			{
				System.out.println();
				System.out.println("What would you like the grade to be?");
				String g=user.next();
				SIS.roster.get(p).setGrade3(g);
				System.out.println(SIS.roster.get(p).getPeriod3() +": "+SIS.roster.get(p).getGrade3());
			}
		else
			{
				System.out.println("Error, please try again");
				c=user.nextInt();
			}
		
		int changeGPA=0;
		ArrayList <String> calcu = new ArrayList <String>();
		calcu.add(SIS.roster.get(p).getGrade1());
		calcu.add(SIS.roster.get(p).getGrade2());
		calcu.add(SIS.roster.get(p).getGrade3());
		
		for(int i=0; i<calcu.size(); i++)
			{
				if(calcu.equals("A+"))
					{
						changeGPA+=4.30;
					}
			}
		
		
		
		System.out.println("Would you like to 1) Change another students grades or 2) Return to Menu?");
		int f= user.nextInt();
		if(f==1)
			{
				changeGrade();
			}
		else if (f==2)
			{
				SIS.menu();
			}
		else
			{
				System.out.println("Error, please try again");
				f=user.nextInt();
			}
		
		
		}
		
		public static void changeSchedule()
		{
			System.out.println();
			System.out.println("Which student's schedule would you like to change?");
			int num=0;
			for (Student k : SIS.roster)
				{
					num++;
					System.out.println(num+") "+k.getFirstName()+ " "+ k.getLastName() + " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());
				}
			int p = user.nextInt();
			p--; 
			 String pd1;
			 String pd2;
			 String pd3; 
			
			ArrayList <String> classes = new ArrayList <String>();
			classes.add("Biology");
			classes.add("Algrebra");
			classes.add("English");
			
			System.out.println("1) "+ classes.get(0));
			System.out.println("2) "+ classes.get(1));
			System.out.println("3) "+ classes.get(2));
			System.out.println("First Period?");
			int choice= user.nextInt();
			choice--;
			pd1= classes.get(choice);
			SIS.roster.get(p).setPeriod1(pd1);
			classes.remove(choice);	
			
			
			
			System.out.println("Second Period?");
			System.out.println("1) "+ classes.get(0));
			System.out.println("2) "+ classes.get(1));
			choice=user.nextInt();
			choice--; 
			pd2= classes.get(choice);
			SIS.roster.get(p).setPeriod2(pd2);
			classes.remove(choice);
			
			
			pd3= classes.get(0); 
			SIS.roster.get(p).setPeriod3(pd3);
			
			System.out.println();
			System.out.println("New Schedule: " + SIS.roster.get(p).getPeriod1() +", "+ SIS.roster.get(p).getPeriod2() +", "+ SIS.roster.get(p).getPeriod3());
			System.out.println();
			
			System.out.println("Would you like to 1) Change another Schedule or 2) Return to menu?");
			int f= user.nextInt();
			if (f==1)
				{
					changeSchedule();
				}
			else if (f==2)
				{
					SIS.menu();
				}
			else
				{
					System.out.println("Error, please try again");
					f=user.nextInt();
				}
			
			
		}
	}
