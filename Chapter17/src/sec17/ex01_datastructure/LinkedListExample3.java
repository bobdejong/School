package sec17.ex01_datastructure;

import java.util.Iterator;
import java.util.LinkedList;

/*public interface Iterator{
	boolean hasNext();  //-->참조할 다음 요소가 있으면 true, 없으면 false
	Object next(); //-->다른요소를 읽어온다.
	void remove(); //-->읽어 온 요소를 삭제
	
}*/



public class LinkedListExample3 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		
		/*Iterator<String> iterator=list.iterator();  ArrayList는 위치가 있어서 0부터 length까지 for로 가져올수 있지
		while(iterator.hasNext()) {					LinkedList는 위치가 없어서 Iterator를 사용하여 가져옴
			String str=iterator.next();			*예전방법*
			System.out.println(str);		 	Iterator 공식임 
		}*/
		
		for(String str:list)   // *신기술* 위치가 있든없든 다 가져옴
			System.out.println(str);
		
		
	}

}
















