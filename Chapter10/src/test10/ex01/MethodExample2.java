package test10.ex01;

class Numbers{
	int num[];
	
	Numbers(int num[]){
		this.num=num;
		
	}
	
	int getTotal() {
		int total=0;
		for(int cnt=0;cnt<num.length;cnt++)
			total+=num[cnt];
		return total;
		
	}
	
	int getAverage() {
		int total;
		total=getTotal();//
		int average=total/num.length;
		return average;
		
	}
	
}

public class MethodExample2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		Numbers obj=new Numbers(arr);

		
		int total=obj.getTotal();
		int average=obj.getAverage();
		
		System.out.println("�հ�="+total);
		System.out.println("���="+average);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
