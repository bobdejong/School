package sec12.ex01_reference;

public class ArrayVarTest2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		printArray(arr);
		arr=null;
		printArray(arr);

	}
	public static void printArray(int arr[]) {
		if(arr==null)
			return; //메소드 종료
		for(int num:arr)
			System.out.println(num);
		
	}
	

}
