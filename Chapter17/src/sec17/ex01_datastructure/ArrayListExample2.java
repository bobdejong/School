package sec17.ex01_datastructure;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2,"키위"); //밀어서 넣어라
		list.set(0,"오렌지");  //0번째를 제거하고 넣어라
		list.remove(1);  //제거
		list.remove("키위");
		
		int num=list.size();
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			
			
			
			System.out.println(str);
		}

	}

}
