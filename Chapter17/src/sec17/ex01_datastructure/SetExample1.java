package sec17.ex01_datastructure;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample1 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();  //���հ���  ������ ����.
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		System.out.println("����� �������� ��="+set.size());
		Iterator<String>iterator=set.iterator();
		
		String str="";
		while(iterator.hasNext()) {
			str=iterator.next();
			
			System.out.println(str);
			
		}
		
		
	}

}
