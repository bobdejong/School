package sec17.ex01_datastructure;

import java.util.HashSet;
import java.util.Iterator;

class A23{}
class B23{}


public class Round15_Ex23 {

	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<Object>();
		A23 ap=new A23();
		B23 bp=new B23();
		String cp="ABC";
		hs.add(ap);
		hs.add(bp);
		hs.add(cp);
		Iterator<Object> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
