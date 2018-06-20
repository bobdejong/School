package test10.ex01;

class Avg{
	String name;
	int avg;
	
	
	
	public String average(int a,int b) {
		
		avg=(a+b)/2;
		  
		return name+avg;
		
	}
	
	//Æò±ÕÀ» ±¸ÇÏ´Â ¸Þ¼Òµå
	
	
}

public class AvgTest {
	
	public static void main(String[] args) {
		Avg student1=new Avg();
		Avg student2=new Avg();
		
		//°´Ã¼
		student1.name="±èÃ¶¼ö";
		student2.name="±è¿µÈñ";
		//ÀÌ¸§
		String st1_avg=student1.average(70,80);
		String st2_avg=student2.average(80,90);
		
		
		System.out.println(st1_avg); //±èÃ¶¼ö75
		System.out.println(st2_avg); //±è¿µÈñ85
	}
	
	
}
