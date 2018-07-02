package sec12.ex01_reference;

enum Season2{
	SPRING("봄"),SUMMER("여름"),FALL("가을"),WINTER("겨울");
	
	final private String name;
	Season2(String name){
		this.name=name;
		
	}
	
	String value() {
		
		return name;
	}
	
}


public class EnumExample3 {

	public static void main(String[] args) {
		printSeason(Season2.SPRING);
		printSeason(Season2.SUMMER);
		printSeason(Season2.FALL);
		printSeason(Season2.WINTER);

	}
	
	public static void printSeason(Season2 season) {
		System.out.println(season.value());
	}

}
