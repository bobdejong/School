package sec17.ex01_datastructure;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2,"Ű��"); //�о �־��
		list.set(0,"������");  //0��°�� �����ϰ� �־��
		list.remove(1);  //����
		list.remove("Ű��");
		
		int num=list.size();
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			
			
			
			System.out.println(str);
		}

	}

}
