package sec12.ex01_reference;

enum Day{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAT,SUNDAY
}


public class EnumExample1 {

	public static void main(String[] args) {
	Day days[]=Day.values();
	for(Day day:days)
	System.out.println(day);

	}

}
