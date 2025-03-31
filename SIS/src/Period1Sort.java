import java.util.Comparator;

public class Period1Sort implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		return o1.getPeriod1().compareTo(o2.getPeriod1());
	}

}
