package sec08.exam03_method;

public class Calculator {
	
		int plus(int x,int y) {
			int result=x+y;
			return result;
			
			
			
		}

		double avg(int x, int y) {  //10 20
			double sum=plus(x,y);
			double result=sum/2;
			return result;
			
		}
		
		void execute() {
			double result=avg(7,10);
			println("실행결과"+result);  //+:결합: 문자열
			
		}
		
		void println(String message) { //void 반환값이 없다.       메소드는 서로 호출이 가능하다.
			System.out.println(message);
			
			
		}
	

}
