import java.util.ArrayList;
import java.util.Iterator;

public class StringPlus {

	public static void main(String[] args) {
		String[] ss= {"����","����","��","�ұ�"};
		String ddd="";
		for(int i=0;i<ss.length;i++) {
			
			ddd+=ss[i];
			
			
		}
		System.out.println(ddd);
		int[] ff= {1,2,3,4,5};
		int dd=0;
		for(int i=0;i<ff.length;i++) {
				
			 dd+=ff[i];
			
		}
		System.out.println(dd);

		ArrayList<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add("Ű��");
		
		System.out.println(list);
		if(list.get(2)=="������")
		
		list.remove(2);
		
		
		
		
		System.out.println(list);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			String curStr=itr.next();
			
			if(!curStr.equals("Ű��")) {
				itr.remove();
				System.out.println(curStr);
			}
		
		
		/*int num=list.size();
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			
			
			
			System.out.println(str);
		}*/

		
		
		
	}
		System.out.println(list);
	}
}
