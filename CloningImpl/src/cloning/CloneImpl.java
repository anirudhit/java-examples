package cloning;

public class CloneImpl {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		PersonImpl p1 = new PersonImpl(1, "Anirudh", "Bellamkonda");
		PersonImpl p2 = (PersonImpl)p1.clone();
		
		System.out.println(p1);
		System.out.println(p2);
		
		p2.id			=	2;
		p2.firstName	=	"Abhijith";
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}

class PersonImpl implements Cloneable{
	int id;
	String firstName;
	String lastName;
	public PersonImpl(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "PersonImpl [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
