package exam01.ex01;

public class Ex07_09 {

	public static void main(String[] args) {
		int hap=0;
		int i;
		
		for(i=1;i<=100;i++) {
				hap+=i;
				if(hap>=1000) {
					break;
				
				}
			
		}
		
		System.out.println("1~100������ �տ��� ó������ 1000�� �Ѵ� ����?"+i+"����"+hap);
	}

}
