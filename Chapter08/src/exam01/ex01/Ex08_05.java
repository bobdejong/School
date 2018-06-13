package exam01.ex01;

public class Ex08_05 {

	public static void main(String[] args) {
		int[] aa=new int[100];
		int bb[]=new int[100];
		int i;
		
		for(i=0;i<100;i++) 
			aa[i]=i*2; //198
			
		//	System.out.printf("%d\n",aa[i]); //100
		
		System.out.println(i);
		
		for(i=0;i<100;i++)
			bb[i]=aa[99-i];
		
		System.out.printf("bb[0]ดย %d, bb[99]ดย %d ภิทยตส\n",bb[0],bb[99]); //198 0
			
	}

}
