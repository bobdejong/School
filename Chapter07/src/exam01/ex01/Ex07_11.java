package exam01.ex01;

public class Ex07_11 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		
		for(i=1;i<=100;i++)
			hap+=i;
		
		System.out.printf("1부터 100까지의 합은 %d 입니다.\n",hap);
		
		if(hap > 5000)
			return; //메소드 종료(함수)
			System.out.println("프로그램 끝입니다.");
			
	}

}
