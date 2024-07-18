package testClass;

public class FirstClass {

		public void Method1(int value) {
//		int value = 2;  
		switch(value) {
		case 1:
			System.out.println("ChromeBrowser");
			break;
		case 2:
			System.out.println("FirefoxBrowser");
			break;
		case 3:
			System.out.println("SafariBrowser");
			break;
		}
		  }
		  
		  public static void main(String[] args) {
			  FirstClass myObj = new FirstClass();
			  myObj.Method1(1);
		  }
		}
  
