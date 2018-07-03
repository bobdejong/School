package sec13.ex01_string;

public class SubStringTest {

	public static void main(String[] args) {
		String message="Java program creates many objects.";
		
		String str1=message.substring(13);
		System.out.println(str1);
		
		String str2=message.substring(13, 16);  //13부터 16번째이전 15까지 가져옴
		System.out.println(str2);

	}

}
