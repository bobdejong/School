package sec15.ex01_wrapper;

public class LunchBox {

	public static void main(String[] args) {
	
		Object[] arr=new Object[5];
		arr[0]="������";
		arr[1]=new Integer(52);
		arr[2]=3.14;
		arr[3]=new Character('��');
		arr[4]=true;

		for(int cnt=0;cnt<arr.length;cnt++)
			System.out.println(arr[cnt]);
		
		
		
		
	}

}
