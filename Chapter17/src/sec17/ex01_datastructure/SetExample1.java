package sec17.ex01_datastructure;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample1 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();  //집합개념  순서가 없다.
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수="+set.size());
		Iterator<String>iterator=set.iterator();
		
		String str="";
		while(iterator.hasNext()) {
			str=iterator.next();
			
			System.out.println(str);
			
		}
		
		
	}

}
