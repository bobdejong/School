package test10.ex01;

class Argument{

public void change(int i, int j[],StringBuffer sb) {    //i�� ���ÿ� ���� ������ �� ���ο� �ִ� i�� �ٸ� , j�� sb�� �ּҰ��� �Ѿ��
																							    //���ο� �ִ� j��sb�� ����
	i=210;
	j[3]=400;
	sb.append("ȭ���� �ڹ�!!!"); //���ڿ� �ڿ� ���ڿ� �߰�
	
	
}

public void display(int i,int j[],StringBuffer sb) {
	System.out.println("��ü ���� i�� ��:"+i);
	System.out.print("�迭�� ��:");
	for(int index=0;index<j.length;index++) 
		System.out.print(j[index]+" ");
		System.out.println();
		System.out.println("���ڿ� sb��"+sb);
		
	
	
	}
}

public class ArgumentTest1 {

	
	
	public static void main(String[] args) {
		Argument d=new Argument();
		int a=10;
		int b[]= {1,2,3,4};  
		StringBuffer c=new StringBuffer("���� ����?");
		System.out.println("ù��° display()�޼ҵ� ȣ��");
		d.display(a, b, c); //���ڰ� 
		d.change(a, b, c);  //a:call by value         call by adress: b=�迭�� �ּҰ��� �Ѿ c=�ּҰ��� �Ѿ
		d.change(a, b, c);
		
		System.out.println("===============================");
		System.out.println("���� ��ȯ�� ���� �ι�° display()�� ȣ��");
		d.display(a, b, c);
		
		
		
		
		
		
		
		
		
		
		
	}

}
