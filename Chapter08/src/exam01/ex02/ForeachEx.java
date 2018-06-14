package exam01.ex02;

public class ForeachEx {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5};
		String[] names= {"사과","배","바나나","체리","딸기","포도"};
		int sum=0;
		
		
		for(int k:num) 
			sum=sum+k;
			System.out.println("합은"+sum);
			
		for(String j:names)
			System.out.println(j);

	}

}
