package test10.ex01;

//정적 초기화 블록
//클래스가 사용되기 전에 jvm에 의해 단 한번 호출

class HundredNumbers{
	static int arr[];
	
	static {
	arr=new int[100];
	for(int cnt=0;cnt<100;cnt++)
		arr[cnt]=cnt;
	}
	
}



public class StaticInitializerExample1 {

	public static void main(String[] args) {
		System.out.println(HundredNumbers.arr[35]);
		System.out.println(HundredNumbers.arr[27]);
		System.out.println(HundredNumbers.arr[63]);
		
		
		
		
		
	}

}
