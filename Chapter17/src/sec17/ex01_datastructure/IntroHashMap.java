package sec17.ex01_datastructure;

import java.util.HashMap;

public class IntroHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> hMap=new HashMap<Integer,String>();
		hMap.put(new Integer(3), "��ħ��");
		hMap.put(5, "������");
		hMap.put(8, "���ȹ�");
		
		System.out.println("6�г� 3�� 8�� �л�:"+hMap.get(new Integer(3)));
		System.out.println("6�г� 3�� 5�� �л�:"+hMap.get(5));
		System.out.println("6�г� 3�� 3�� �л�:"+hMap.get(8));
		System.out.println("6�г� 3�� 3�� �л�:"+hMap.get(3));
		
		hMap.remove(5);//
		System.out.println("6�г� 3�� 5�� �л�:"+hMap.get(5)); //�ش�Ǵ� Ű���� ������ null�� ��ȯ

	}

}