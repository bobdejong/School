package exam01.ex01;

public class Ex03_12 {

	public static void main(String[] args) {
		char a,b,c,d,e; //���� (�������� �Ұ�),char(2byte)
						//0~65535
		a='A'; // 65 (�ƽ�Ű�ڵ�)
		System.out.printf("%c\t",a);
		
		System.out.printf("%d\n",(int)a); //(�������� �Ұ�)
		
		
		//a=-1; (�������� �Ұ�)
		
		b='a';  //97
		c=(char) (b+1); //4byte ����Ȱ��� charŸ�Կ� ���� �Ұ� ����ȯ �� ����
		
		System.out.printf("%c\t",b);
		
		System.out.printf("%d\n",(int)c);
		
		d=90;
		//System.out.printf("%d \n",d);
		System.out.printf("%c \n",d);
		System.out.printf("%d \n",(int)d);
		
		d='��'; //java unicode
		System.out.printf("%c\n",d);
		System.out.printf("%d\n",(int)d);  //44032
		
		e=(char) (d+1);
		System.out.printf("%d\n",(int)e);
		System.out.printf("%c\n",e);
		
		
		
		
	}

}
