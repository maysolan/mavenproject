package testClass;

public class AddProgram {

	 int a;
	 int b;
	 int c;
	 int d;
	public void add(){

		a = 3;
		b = 4;
		c=a+b;
		d=c;
		
		System.out.println("Value of D is--->" +d);
	}
	
	public static void main(String[]args) {
		
		AddProgram addprogram = new AddProgram();
		addprogram.add();
	}

}
