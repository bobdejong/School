package test10.ex01;

//���� �ʱ�ȭ ���
//Ŭ������ ���Ǳ� ���� jvm�� ���� �� �ѹ� ȣ��

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
