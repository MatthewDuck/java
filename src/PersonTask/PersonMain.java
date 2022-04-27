package PersonTask;

public class PersonMain {
	public static void main(String[] args) {
		Person dave = new Person("Dave", "Smith");
		Person greg = new Person("Greg", "Wilson", 190, 12, 72, "Mailman");
		Person jack = new Person("Jack", "Black");
		Person bob = new Person("Bob", "Mortimer", 180, 10, 46, "Engineer");
		dave.greet();
		jack.greet();
		greg.size();
		bob.size();
		bob.career();
		
	}
	
	
	

}
