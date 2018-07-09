package sec17.ex01_datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objArr= {"1",new Integer(1),"2","2","3","3","4","4","4"}; 
		Set<Object> set=new HashSet<Object>();  //set이 HashSet의 부모 다형성
		for(int i=0;i<objArr.length;i++)
			set.add(objArr[i]);
		
		for(Object obj:set) {
			System.out.println(obj);
		}
		
		//"1",new Integer(1)은 스트링타입과 인티져타입이라 중복저장이 아님
		
		/*Iterator<Object>iterator=set.iterator();
		while(iterator.hasNext()) {
			Object str=iterator.next();
			
			System.out.println(str);
			
		}*/
			
	}
		

}
