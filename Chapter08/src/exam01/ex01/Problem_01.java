package exam01.ex01;

public class Problem_01 {

	public static void main(String[] args) {
		int[][] gugu=new int[9][9];
		int i,k;
		
		for(i=0;i<9;i++)
			for(k=0;k<9;k++)
				gugu[i][k]=(i+1)*(k+1);
		
		for(i=0;i<9;i++) {
			for(k=1;k<9;k++) {
				System.out.printf("%d*%d=%2d  ",k+1,i+1,gugu[i][k]);
			}
			System.out.println();
		}
		
	}

}
