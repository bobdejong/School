package sec13.ex01_string;

public class StringBufferTest2 {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer("�ȳ� �ڹ�");
		System.out.println("���ۿ� ����ִ� ����=>"+str1);
		System.out.println("���ڿ� �����ֱ�=>"+str1.insert(3, "power"));
		System.out.println(str1);
		System.out.println("������ 5��° ����=>"+str1.charAt(4));
		
		str1.setCharAt(0, '��'); //set ���� get ��������
		System.out.println("0��° ���� '��'���� ����=>"+str1);
		str1.setLength(8);
		System.out.println("������ ���ο� ��=>"+str1);
		System.out.println("���ڿ��� ��������ϱ�=>"+str1.reverse());
		
		
		
	}

}
