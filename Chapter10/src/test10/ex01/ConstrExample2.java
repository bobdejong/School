package test10.ex01;

public class ConstrExample2 {

	public static void main(String[] args) {
		SubscriberInfo obj1=new SubscriberInfo("�����","poorman","zebi"); 
		SubscriberInfo obj2=new SubscriberInfo("�����","richman","money","010-0000-0000","Ÿ���Ӹ���"); 
		
		/*System.out.println("�̸�:"+obj1.name);
		System.out.println("���̵�:"+obj1.id);
		System.out.println("�н�����:"+obj1.password);
		System.out.println("��ȭ��ȣ:"+obj1.phoneNo);
		System.out.println("�ּ�:"+obj1.address);
		System.out.println();
		
		
		System.out.println("�̸�:"+obj2.name);
		System.out.println("���̵�:"+obj2.id);
		System.out.println("�н�����:"+obj2.password);
		System.out.println("��ȭ��ȣ:"+obj2.phoneNo);
		System.out.println("�ּ�:"+obj2.address);
		System.out.println();*/
		
		ss(obj1);
		ss(obj2);
		
	}

	public static void ss(SubscriberInfo dd) {
		System.out.println("�̸�:"+dd.name);
		System.out.println("���̵�:"+dd.id);
		System.out.println("�н�����:"+dd.password);
		System.out.println("��ȭ��ȣ:"+dd.phoneNo);
		System.out.println("�ּ�:"+dd.address);
		System.out.println();
		
		
	}
	
	
	
	
}
