package sec17.ex01_datastructure;

import java.util.Iterator;
import java.util.LinkedList;

/*public interface Iterator{
	boolean hasNext();  //-->������ ���� ��Ұ� ������ true, ������ false
	Object next(); //-->�ٸ���Ҹ� �о�´�.
	void remove(); //-->�о� �� ��Ҹ� ����
	
}*/



public class LinkedListExample3 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("����");
		list.add("���ξ���");
		list.add("�ٳ���");
		
		/*Iterator<String> iterator=list.iterator();  ArrayList�� ��ġ�� �־ 0���� length���� for�� �����ü� ����
		while(iterator.hasNext()) {					LinkedList�� ��ġ�� ��� Iterator�� ����Ͽ� ������
			String str=iterator.next();			*�������*
			System.out.println(str);		 	Iterator ������ 
		}*/
		
		for(String str:list)   // *�ű��* ��ġ�� �ֵ���� �� ������
			System.out.println(str);
		
		
	}

}
















