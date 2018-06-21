package sec10.exam01_static_member;

public class MethodExample1 {

	public static void main(String[] args) {
		/*MethodExample1 method=new MethodExample1();  
		
		method.printCharacter('*',30);
		System.out.println("Hello,Java");
		method.printCharacter('-',30);*/
		
		printCharacter('*',30);
		System.out.println("Hello,Java");
		printCharacter('-',30);
		
		

	}

	static void printCharacter(char ch,int num) {
		for(int cnt=0;cnt<num;cnt++) 
			System.out.print(ch);
			System.out.println();
			
		
		
	}
	
}
