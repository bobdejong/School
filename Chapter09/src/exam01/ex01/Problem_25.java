package exam01.ex01;

public class Problem_25 {

	static int getNumber() {
		return (int)(Math.random()*45+1);
		
	}
	
	public static void main(String[] args) {
		int[] lotto= {0,0,0,0,0,0};
		int i,k,num;
		char dupl='N';
		
		System.out.println("�ζ� ��÷�� �����մϴ�.");
		
		for(i=0;i<6;i++) {         //for(i=0;i<6;)
			num=getNumber();
			
			for(k=0;k<6;k++)
				if(lotto[k]==num) 
					dupl='Y';
				 
				 
				
			if(dupl=='N')
					lotto[i]=num;  //i++ �ٶ��� i�� �����ϰ�
			
			else {
				dupl='N';
				i--;
				}
			
		}
		
		System.out.println("��÷�� �ζ� ��ȣ==>");
		for(i=0;i<6;i++) {
			System.out.printf("%d  ",lotto[i]);
			
		}
		
		
		
		
		
		
		
		
	}

}
