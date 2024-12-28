package date28;

public class prog1 {
	void add(int a,int b) {
		System.out.println("a+b..."+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("a+b+c...."+(a+b+c));
	}
	void add(String firstName,String lastName) {
		System.out.println("full name---->"+ firstName +" "+lastName);
	}
}
public class OverLoadingDemo {
	public static void main(String []args) {
		AddDemo addDemo = new addDemo();
		addDemo.add(100,200);
		addDemo.add("D","LUFFY");
		addDemo.add(100,200,300);
	}
	public static void main(String fname,String Lname) {
}
	public static void main(int a,int b) {
}
}