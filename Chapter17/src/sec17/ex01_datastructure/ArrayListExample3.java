package sec17.ex01_datastructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		//LinkedList<String> list=new LinkedList<String>();
		
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");
		
		int index1=list.indexOf("���");
		int index2=list.lastIndexOf("���");
		int index3=list.indexOf("����");
		
		System.out.println("ù��° ���:"+index1);
		System.out.println("������ ���:"+index2);
		System.out.println("Not Found:index3="+index3);
		
		for(String str:list)
			System.out.println(str);
		
	}

}
