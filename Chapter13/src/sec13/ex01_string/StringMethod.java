package sec13.ex01_string;

public class StringMethod {

	public static void main(String[] args) {
		String str1="Smart";
		String str2=" and ";
		String str3="Simple";
		String str4=str1.concat(str2).concat(str3);
		System.out.println(str4);
		
		System.out.println("���ڿ��� ����"+str4.length());
		
		if(str1.compareTo(str3)<0)
		//if(str1.compareTo(str3)==0)  //������ 0�� ��ȯ ũ�� 1�� ��ȯ ������ -1�� ��ȯ	
			System.out.println("str1�� �ռ���");
			//System.out.println("����");
		else
			System.out.println("str3�� �ռ���.");
			//System.out.println("�ٸ���");
		
		
	}

}
