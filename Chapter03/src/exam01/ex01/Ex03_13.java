package exam01.ex01;

public class Ex03_13 {

	public static void main(String[] args) {
		int a,b;
		char c,d;
		
		a=0xF90A; // 0x:16���� 
		b=0x50;
		
		System.out.printf("%c\n",a);

		c=(char) b;
		System.out.printf("%c\n",c);
		d='#';
		System.out.printf("%c�� ASCII���� %d �Դϴ�. \n",d,(int)d);

	}

}
