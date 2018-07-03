package sec13.ex01_string;

public class FindBlankIndex {

	public static void main(String[] args) {
		String message="Java program creates many objects.";
		
		int len=message.length();
		System.out.println(len);
		
		for(int i=0;i<len;i++) {
			char c=message.charAt(i);
			
			if(c==' ') {
			System.out.println("index="+i);
			}
		}

	}

}
