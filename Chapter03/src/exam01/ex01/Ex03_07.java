package exam01.ex01;

public class Ex03_07 {

	public static void main(String[] args) {

		int a;  //���� (4byte)
		float b; //�Ǽ� (4byte)
		double c;  //�Ǽ�(8byte)
		
		
		a=(int) 123.45;  // ���� ����
		b=123.45f; // �Ǽ��� �⺻ ũ��� 8byte f�� ���̸� 4byte�� ���� 
		System.out.printf("b�� ��==>%f\n",b);
		b=200;
		
		System.out.printf("a�� ��==>%d\n",a);
		System.out.printf("b�� ��==>%f\n",b);
		
		c=123.45;
		System.out.printf("b�� ��==>%f\n",c);
		
		
	}

}
