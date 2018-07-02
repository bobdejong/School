package sec12.ex01_reference;

enum Day1{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAT,SUNDAY
}

public class EnumExample2 {

	public static void main(String[] args) {
		printDay("MONDAY");
		printDay("WEDNESDAY");
		printDay("FRIDAY");

	}
	
	static void printDay(String name) {
		Day1 day=Day1.valueOf(name);
		System.out.println(day);
	}

}
