package exam01.ex01;

public class Ex03_16 {

	public static void main(String[] args) {
		byte bt=10;
		short st=20;
		int it=30;
		long ln=40L; //long(8byte)
		float flt=3.14f;
		double db1=3.14;
		String str1="10",str2="20";
		
		ln=it=st=bt;
		System.out.printf("%d\n",ln);
		
		db1=flt;
		System.out.printf("%f\n",db1);
		
		System.out.printf("%d\n",Integer.parseInt(str1)+Integer.parseInt(str2));
		
	}

}
