package sec08.exam02_abstract_method;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	public abstract void sound(); //�߻� �޼ҵ�
	
	
}


//�߻�޼ҵ带 ������ Ŭ������ ������ �߻�Ŭ�����̴�.
//�ݴ�� �߻�Ŭ������ �ݵ�� �߻�޼ҵ尡 �־�ߵǴ� ���� �ƴϴ�.