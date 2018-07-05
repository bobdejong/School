package sec15.ex01_wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		Integer obj=new Integer("10");
		int sum=obj+20;  //obj.intValue+20  //auto Unboxing
		
		System.out.println(sum);

	}

}
