package exam01.ex01;

public class Ex04_04 {

	public static void main(String[] args) {
		int a=10,b;
		
		a++;
		
		++a;
		System.out.println(a);
		
		b=a++;  //���� ������
		System.out.printf("%d %d\n",b,a);
		
		b=++a; //���� ������
		System.out.printf("%d %d\n",b,a);
		
		b=++a+2;
		System.out.printf("%d %d\n",b,a);
		
		b=a++ + 3;
		System.out.printf("%d %d\n",b,a);
	}

}
