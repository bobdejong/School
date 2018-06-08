package exam01.ex02;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode='A'; //65
		
		if((charCode >= 65) & (charCode <= 90)) {  //&은 양쪽 다 비교
			System.out.println("대문자 이군요");
		}
		if((charCode >= 97) && (charCode <=122)) {  //&&은 이미 앞에서 거짓이면 뒤연산을 안함
			
			System.out.println("소문자 이군요");
			
		}
		if(!(charCode<48) && !(charCode >57)) {
			System.out.println("0~9숫자 이군요");
			
		}
		
		int value=6;
		
		if ((value % 2==0)|(value=value+2)% 3==0) {
			System.out.println("2또는 3의 배수 이군요");
			System.out.println(value);
			
		}
		if((value %2 ==0)||(value=value+11)% 3==0) {  //앞에가 참이면 뒤연산 안함
			System.out.println("2또는 3의 배수 이군요");
			System.out.println(value);
		}
				
	}

}
