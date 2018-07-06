package sec17.ex01_datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class PrimitiveCollection {

	public static void main(String[] args) {
		 LinkedList<Integer> list=new LinkedList<Integer>();
		 
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 
		 Iterator<Integer> itr=list.iterator();
		 while(itr.hasNext()) {
				Integer dd=itr.next();
				System.out.println(dd);

	}
	}
}
