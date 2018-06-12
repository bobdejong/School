package exam01.ex01;

public class Ex07_10 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		
		for(i=1;i<=100;i++) {
			if(i%3==0) 
				continue;//다시 반복으로 보내는 역할 아래로 절대 내려가지 않는다.
			hap+=i;
			
			
			
		}
		
		System.out.printf("1~100까지의 합(3의 배수 제외):%d\n",hap);
		
	}

}
