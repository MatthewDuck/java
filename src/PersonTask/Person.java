package PersonTask;

public class Person {
	
	private String firstName;
	private String secondName;
	private int height;
	private int shoeSize;
	private int age;
	private String jobTitle;
	
	public Person(String firstName, String secondName, int height, int shoeSize, int age, String jobTitle) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.height = height;
		this.shoeSize = shoeSize;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public Person(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public void greet() {	
		System.out.println("Hello " + firstName + " " + secondName);
	}
	
	public void size() {
		System.out.println("Hello " + firstName + " " + secondName + "." + "You are " + height + "cm tall and have size " + shoeSize + " feet.");
	}
	
	public void career() {
		System.out.println("Hello " + firstName + " " + secondName + "." + "You are " + age + " and you are a " + jobTitle);
	}
}
