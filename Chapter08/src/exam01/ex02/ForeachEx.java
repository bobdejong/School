package exam01.ex02;

public class ForeachEx {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		String[] names= {"���","��","�ٳ���","ü��","����","����"};
		int sum=0;
		
		
		for(int k:num) 
			sum=sum+k;
			System.out.println("����"+sum);
			
		for(String j:names)
			System.out.println(j);

	}

}
