package testClass;

public class ThirdClass implements Demoday {

	@Override
	public void sum(int a, int b) {
		System.out.println(a+b);
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a-b);
		
	}

public static void main (String [] args) {
	
	ThirdClass obj = new ThirdClass();
	obj.sum(2, 3);
	obj.sub(3, 2);
}
	
}
//}