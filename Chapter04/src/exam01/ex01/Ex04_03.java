package exam01.ex01;

public class Ex04_03 {

	public static void main(String[] args) {
		int a=10;
		
		a++;//a=a+1;
		System.out.printf("a++===>%d\n",a);
		
		a--; //a=a-1
		System.out.printf("a--===>%d\n",a);
		
		a+=5; //a=a+5;
		System.out.printf("a+=5===>%d\n",a);
		
		a-=5; //a=a-5;
		System.out.printf("a-=5===>%d\n",a);
		
		a*=5; //a=a*5;
		System.out.printf("a*=5===>%d\n",a);

		a/=5; //a=a/5;
		System.out.printf("a/=5===>%d\n",a);
		
		a%=5; //a=a%5; 나머지
		System.out.printf("a%%=5===>%d\n",a);  //%기호를 출력하려면 %%써야함

	}

}
