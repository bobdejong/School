package sec13.ex01_string;

public class IndexOfTest {

	public static void main(String[] args) {
		String message="Java program creates many objects.";
		
		int index1=message.indexOf('a');
		int index2=message.indexOf(97);
				
				System.out.println(index1);
				System.out.println(index2);

		int index3=message.indexOf('a',13); //13번째 이후에 나오는 a의 값
		System.out.println(index3);
				
		int index4=message.indexOf("pro");
		System.out.println(index4);
				
	}

}
