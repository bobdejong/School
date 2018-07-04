package sec15.ex01_wrapper;

public class WrapperExample3 {

	public static void main(String[] args) {
		int total=0;
		
		for(int cnt=0;cnt<args.length;cnt++)
			total+=Integer.parseInt(args[cnt]);
		
		System.out.println(total);
			
			
	}

}
