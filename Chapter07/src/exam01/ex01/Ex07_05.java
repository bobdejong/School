package exam01.ex01;

public class Ex07_05 {

	public static void main(String[] args) {
		int a=100;
		
		while(a==200) {
			System.out.println("whlie문 내부에 들어 왔습니다.");
			
			
		}
		
		do {
			System.out.println("do-while문 내부에 들어 왔습니다.");  //먼저 처리하고 나중에 비교
			//
			//a++;
		}while(a<=200);

	}

}
