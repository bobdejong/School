package sec10.exam02._static_block;

public class Television {
	static String company="Samsung";
	static String model="lcd";
	static String info;
	
	static {
		info=company+"-"+model;
	}
	
	
}
