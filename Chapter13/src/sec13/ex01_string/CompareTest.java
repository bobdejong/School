package sec13.ex01_string;

public class CompareTest {

	
	
	public static void main(String[] args) {
		
		String array1[]= {"IMF","���ֵ�","�ڹٵ���","�ѱ۳���","Computer","��ī","JAVA","���ͳ�Ž��","�ʷ��ʷ�",
				"come","�ٶ�","��ũ����","������","����","their","country"};
		
		System.out.println("========���� �� ������=========");
		for(int k=0;k<array1.length;k++)
			System.out.print(array1[k]+" ");
		System.out.println();
		
		System.out.println("========���� �� ������=========");
		for(int i=0;i<array1.length;i++) {
			
			for(int j=i+1;j<array1.length;j++) {
				String k=" ";
				if(array1[i].compareTo(array1[j])>0) {
					k=array1[i];
					array1[i]=array1[j];
					array1[j]=k;
				}
				
			}
			System.out.print(array1[i]+" ");
		}

	}

}
