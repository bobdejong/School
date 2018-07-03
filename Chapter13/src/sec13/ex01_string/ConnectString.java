package sec13.ex01_string;

public class ConnectString {

	public static void main(String[] args) {
		String gemini="gemini";
		String johnharu="johnharu";
		
		String tempString1=gemini+johnharu;
		
		System.out.println(tempString1);
		System.out.println("gemini"+"johnharu");
		
		String tempString2=tempString1+100;
		System.out.println(tempString2);
		

	}

}
