import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SIS
	{

	public static ArrayList <Student> roster = new ArrayList <Student>();



		static Scanner user= new Scanner (System.in);

	

		static	double GPA = 0.00;

		static int counter = 0;


		static DecimalFormat cs = new DecimalFormat("##.00");



		public static void main(String[] args)
			{
				
				String file1 = "StudentList.txt"; 

				//for loop through get grade use if else to add a certain number to gpa
				// make a seperate array list for gpa ):
				// 
			

				System.out.println(roster.size());
			


				fillArray();
				menu();
				SortStudent.sortByLastName();

			
			}
		
		public static void fillArray()


		{
			String file1 = "StudentList.txt"; 
			
			

			try
				{
					Scanner myFile = new Scanner (new File("StudentList.txt"));
					while(myFile.hasNext())
						{
							roster.add(new Student(myFile.next(),myFile.next(),0.00,myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next(),myFile.next()));
						}

					GpaCalculator.Calc();
					
					int classNum=0;
					for (Student k : roster)
						{
							classNum++;
							System.out.println(classNum+" "+ k.getFirstName()+ " "+ k.getLastName() + " " +  k.getGpa()+  " " + k.getPeriod1()+ " "+ k.getGrade1()+ " " + k.getPeriod2()+ " "+ k.getGrade2()+ " " + k.getPeriod3()+ " "+ k.getGrade3());

						}
					
					
				
					
				} catch (FileNotFoundException e)
				{
				
					e.printStackTrace();
				}
		}	
		
		
		public static void menu()
			{
				System.out.println();
				System.out.println("What would you like to do?");
				System.out.println("1) Add or delete student");
				System.out.println("2) Change students grades or schedules");
				System.out.println("3) Sort Students");
				int choice= user.nextInt();
				if (choice ==1)

					{
						AddOrRemoveStudent.choose();
						System.out.println();
						
					}
				else if (choice ==2)

					{
						ChangeSchedulesOrGrades.pick();
						
					}

				else if (choice ==3)
					{
						System.out.println("Pick one");
						System.out.println("1) Sort by last name");
						System.out.println("2) Sort by GPA");
						System.out.println("3) Sort by period");
						int sortChoice=user.nextInt();
						if ( sortChoice==1)
							{
								SortStudent.sortByLastName();
								int classNum = 1;
								for(Student s: SortStudent.sortByLastName())
								{
									System.out.println(classNum+" "+ s.getFirstName()+ " "+ s.getLastName() + " " +  s.getGpa()+  " " + s.getPeriod1()+ " "+ s.getGrade1()+ " " + s.getPeriod2()+ " "+ s.getGrade2()+ " " + s.getPeriod3()+ " "+ s.getGrade3());
									classNum ++;
								}
							}
						else if ( sortChoice==2)
							{
								System.out.println("link GPA method");
							}
						else if ( sortChoice==3)
							{

							System.out.println("Which period do you want to sort by?");
							System.out.println("1) ");
							System.out.println("2) ");
							System.out.println("3) ");
							int sortPeriodChoice = user.nextInt();
							
							//if choice == 1 then period 1
							// else if choice == 2 then period 2
							//else if 3 then period 3
							SortStudent.sortByPeriod1();
							int classNum =1;
							for(Student s: SortStudent.sortByLastName()) 
								{
									System.out.println(classNum+" "+ s.getFirstName()+ " "+ s.getLastName() + " " +  s.getGpa()+  " " + s.getPeriod1()+ " "+ s.getGrade1()+ " " + s.getPeriod2()+ " "+ s.getGrade2()+ " " + s.getPeriod3()+ " "+ s.getGrade3());
									classNum ++;
								}

								sortByPeriod();

							}
						else
							{
								System.out.println("Error, please try again");
								menu();
							}
						
					}	
				}

			

	}

		



	
			
		

	

