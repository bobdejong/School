package exam01.ex01;

import java.util.Scanner;

public class Ex08_10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int raw,col;
		
		System.out.println("�� ����� �Է�:");
		raw=s.nextInt();
		System.out.println("�� ����� �Է�:");
		col=s.nextInt();
		
		int[][] aa=new int[raw][col];
		int i,k;
		int val=1;
		
		for(i=0;i<raw;i++) {
			for(k=0;k<col;k++) {
				aa[i][k]=val;
				++val;
				
			}
			
		}
		
		
		
			
		System.out.printf("aa[0][0]���� aa[%d][%d]���� ���\n",raw,col);
		
		for(i=0;i<raw;i++) {
			for(k=0;k<col;k++) {
				System.out.printf("%-3d",aa[i][k]);
				
				
			}
			System.out.println();
		}
		
		//System.out.printf("%3d %3d %3d %3d\n",aa[0][0],aa[0][1],aa[0][2],aa[0][3]);
		//System.out.printf("%3d %3d %3d %3d\n",aa[1][0],aa[1][1],aa[1][2],aa[1][3]);
		//System.out.printf("%3d %3d %3d %3d\n",aa[2][0],aa[2][1],aa[2][2],aa[2][3]);

	}

}
