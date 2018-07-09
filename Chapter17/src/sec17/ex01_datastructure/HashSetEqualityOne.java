package sec17.ex01_datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class SimpleNumber{
	int num;
	
	public SimpleNumber(int n) {
		num=n;
	}
	
	public String toString() {
		//return num+"";
		return String.valueOf(num);
		//return new Integer(num).toString();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof SimpleNumber) {
			SimpleNumber sn=(SimpleNumber)obj;
			return this.num==sn.num;
			
		}else
			return false;
			
	}
	public int hashCode() {
		return Objects.hash(num);
	}
	
	
}


public class HashSetEqualityOne {

	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(20));

		System.out.println("저장된 데이터 수:"+hSet.size());
		
		System.out.println(hSet);
		
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
			
		}
		
		
		
		
		
		
	}

}
