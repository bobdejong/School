package sec20.ex01_system;

class ResourceUser{

    ResourceUser(){
          System.out.println("시스템 자원을 할당 받습니다.");

    }
    void use(){
          System.out.println("시스템 자원을 사용합니다.");

    }
    protected void finalize(){
          System.out.println("시스템 자원의 할당을 해제 합니다.");

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
