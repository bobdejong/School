package sec13.ex01_string;

public class CompareTest {

	
	
	public static void main(String[] args) {
		
		String array1[]= {"IMF","제주도","자바도시","한글나라","Computer","모카","JAVA","인터넷탐색","초롱초롱",
				"come","바람","스크립터","군고구마","도서","their","country"};
		
		System.out.println("========정렬 전 데이터=========");
		for(int k=0;k<array1.length;k++)
			System.out.print(array1[k]+" ");
		System.out.println();
		
		System.out.println("========정렬 후 데이터=========");
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
