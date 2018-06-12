package exam01.ex02;

import java.util.Scanner;

public class ForControlTest_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int begin = 0, end = 0, multiple=0, total = 0;
		int imsi = 0; // 시작 수가 마지막 수보다 클 경우 두 수를 교환하기 위해서 필요

		System.out.print("시작 수=");
		begin = in.nextInt();

		System.out.print("마지막 수=");
		end = in.nextInt();
		
		System.out.println("배수=");
		multiple=in.nextInt();
		

		if (begin > end) {
			imsi = begin;
			begin = end;
			end = imsi;

		}

		for (int i = begin; i <= end; i++) {
			if(i%multiple==0) {
				total+=i;
				
			}
			
		}

		System.out.println(begin + "부터" + end + "까지 수중 " + multiple + "배수의 합은"+total+"입니다.");

	}

}
