package test11.ex02;

abstract class PersonalNumberStorage{

	public abstract void addPersonalInfo(String name,String perNum);
	public abstract String searchName(String perNum);
}

class PersonlNumInfo{
	String name;
	String number;
	
	PersonlNumInfo(String name,String number){
		this.name=name;
		this.number=number;
	}
	
	String getName() {
		return name;
		
	}
	
	String getNumber() {
		return number;
	}
	
}

class PersonalNumberStorageImp extends PersonalNumberStorage{
	PersonlNumInfo[] perArr;
	int numOfperInfo;
	
	public PersonalNumberStorageImp(int sz) {
		perArr=new PersonlNumInfo[sz];
		numOfperInfo=0;
	}
	
	public void addPersonalInfo(String name, String perNum) {
		PersonlNumInfo p=new PersonlNumInfo(name,perNum);
		perArr[numOfperInfo]=p;
		numOfperInfo++;
		
	}
	public String searchName(String perNum) {
		for(int i=0;i<numOfperInfo;i++) {
			if(perNum.compareTo(perArr[i].getNumber())==0)
				return perArr[i].getName();
				
			
		}
		return null;
	}
	
	
}


public class AbstractInterface {

	public static void main(String[] args) {
		PersonalNumberStorage storage=new PersonalNumberStorageImp(100);
		storage.addPersonalInfo("이순신", "950000-1122333");
		storage.addPersonalInfo("홍길동", "970000-1122333");
		
		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122333"));
		
		
	}

}
