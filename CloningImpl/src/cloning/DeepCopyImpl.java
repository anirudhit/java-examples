package cloning;

public class DeepCopyImpl {
	
	public static void main(String[] args) {
		Person p1 = new Person(1, "Anirudh", "Bellamkonda");
		Person p2 = new Person();
		p2.id			=	p1.id;
		p2.firstName	=	p1.firstName;
		p2.lastName		=	p1.lastName;
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		p2.id			=	2;
		p2.firstName	=	"Abhijith";
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
	}

}

class Person{
	int id;
	String firstName;
	String lastName;
	
	public Person() {
	}
	public Person(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}