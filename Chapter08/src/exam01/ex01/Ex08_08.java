package exam01.ex01;

public class Ex08_08 {

	public static void main(String[] args) {
		int[][] aa=new int[3][4];
		int i,k;
		int val=1;
		
		for(i=0;i<=2;i++) {
			for(k=0;k<=3;k++) {
				aa[i][k]=val;
				++val;
				
			}
			
		}
		
		
		
			
		System.out.println("aa[0][0]���� aa[2][3]���� ���");
		
		for(i=0;i<=2;i++) {
			for(k=0;k<=3;k++) {
				System.out.printf("%3d",aa[i][k]);
				
				
			}
			System.out.println();
		}
		
		//System.out.printf("%3d %3d %3d %3d\n",aa[0][0],aa[0][1],aa[0][2],aa[0][3]);
		//System.out.printf("%3d %3d %3d %3d\n",aa[1][0],aa[1][1],aa[1][2],aa[1][3]);
		//System.out.printf("%3d %3d %3d %3d\n",aa[2][0],aa[2][1],aa[2][2],aa[2][3]);
		
		
	}

}
