package sec14.exam01_getter_setter;

public class Car {
	private int speed;
	private boolean stop;  //디폴트값 false
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed=0;
		return;
	}else {
		this.speed = speed;
	}
	}
	public boolean isStop() {  //true,false
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed=0;
	}
	
	
	
	
	
}
