package sec15.ex01_wrapper;

public class AboutStaticWrapping {

	public static void main(String[] args) {
		Integer iValue1=Integer.valueOf(10);
		Integer iValue2=Integer.valueOf(10);
		
		if(iValue1==iValue2)  //��ü�� �ΰ��� ������ �ʰ� �ϳ��� �������. ���� ���� �ָ� �Ǵٸ� ��ü�� ������ �ʴ´�.
			System.out.println("iValue1�� iValue2�� ���� �ν���Ʈ ����");
		else
			System.out.println("iValue1�� ivalue2�� �ٸ� �ν���Ʈ ����");
		
		//��ü ==�ν���Ʈ
	}

}
