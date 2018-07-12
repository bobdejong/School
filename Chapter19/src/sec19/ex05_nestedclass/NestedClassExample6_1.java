package sec19.ex05_nestedclass;

interface PlaneObject{
	Location getLocation();
	void setLocation(int x,int y);
	
	static class Location{
		int x,y;
		Location(int x,int y){
			this.x=x;
			this.y=y;
		}
	}	
}

class Rectangle implements PlaneObject{
	Location location;
	int width,height;
	
	Rectangle(int x,int y,int width,int height){
		this.location=new Location(x,y);//
		this.width=width;
		this.height=height;
	}


	public Location getLocation() {
		return location;
	}
	public void setLocation(int x, int y){
		location.x=x;
		location.y=y;
	}
}

public class NestedClassExample6_1 {

	public static void main(String[] args) {
		Rectangle re=new Rectangle(30,30,30,30);
		System.out.println(re.getLocation().x+" "+re.getLocation().y);
		re.setLocation(10, 10);	
		System.out.println(re.getLocation().x+" "+re.getLocation().y);

	}

}
