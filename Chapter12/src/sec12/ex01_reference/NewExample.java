package sec12.ex01_reference;

enum Season{  //���� Ŭ����
	SPRING,SUMMER,FALL,WINTER  //���� ���
}

class ClothingInfo{
	String code;
	String name;
	String material;
	Season season;
	
	ClothingInfo(String code, String name, String material, Season season){
		this.code=code;
		this.name=name;
		this.material=material;
		this.season=season;
		
	}
	
}

public class NewExample {

	public static void main(String[] args) {
		ClothingInfo obj=new ClothingInfo("32919","����Ƽ����","��100%",Season.SUMMER);
		//Season se=new Season(); ����Ŭ������ ��ü���� ����
		
		System.out.println("��ǰ�ڵ�:"+obj.code);
		System.out.println("��ǰ��"+obj.name);
		System.out.println("����:"+obj.material);
		System.out.println("��������:"+obj.season);
	}

}
