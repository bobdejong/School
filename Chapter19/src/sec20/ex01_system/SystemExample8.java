package sec20.ex01_system;

class ResourceUser{

    ResourceUser(){
          System.out.println("�ý��� �ڿ��� �Ҵ� �޽��ϴ�.");

    }
    void use(){
          System.out.println("�ý��� �ڿ��� ����մϴ�.");

    }
    protected void finalize(){
          System.out.println("�ý��� �ڿ��� �Ҵ��� ���� �մϴ�.");

    }

}


public class SystemExample8 {

	public static void main(String[] args) {
		ResourceUser obj = new ResourceUser();

        obj.use(); 
        obj = null;
        System.gc();

	}

}
