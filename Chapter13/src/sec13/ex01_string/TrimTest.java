package sec13.ex01_string;

public class TrimTest {

	public static void main(String[] args) {
		String str1=new String("gemini   ");
		String str2=new String("    gemini");
		
		System.out.println(str1.equals(str2));  //false 공백위치까지 비교
		
		System.out.println(str1.trim().equals(str2.trim()));  //true  trim-공백제거
		
	}

}
