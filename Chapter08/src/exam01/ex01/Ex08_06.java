package exam01.ex01;

public class Ex08_06 {

	public static void main(String[] args) {
		int aa[]= {10,20,30,40,50};
		int count,size;
		
		count=aa.length;
		
		System.out.printf("�迭 aa[]�� ����� ������ %d�� �Դϴ�.",count);

		size=count*Integer.BYTES;
		System.out.printf("�迭 aa[]�� ����� ��ü ũ��� %d ����Ʈ�Դϴ�.\n",size);
	}

}